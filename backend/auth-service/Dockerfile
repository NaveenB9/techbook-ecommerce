# ---------- BUILD STAGE ----------
FROM maven:3.9.9-eclipse-temurin-21 AS build

WORKDIR /build

# Copy parent pom
COPY backend/pom.xml backend/pom.xml

# Copy service pom
COPY backend/auth-service/pom.xml backend/auth-service/pom.xml

# Download dependencies
RUN mvn -f backend/auth-service/pom.xml dependency:go-offline

# Copy service source
COPY backend/auth-service/src backend/auth-service/src

# Build
RUN mvn -f backend/auth-service/pom.xml clean package -DskipTests

# ---------- RUNTIME STAGE ----------
FROM eclipse-temurin:21-jre

WORKDIR /app

COPY --from=build /build/backend/auth-service/target/*SNAPSHOT.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","/app/app.jar"]
