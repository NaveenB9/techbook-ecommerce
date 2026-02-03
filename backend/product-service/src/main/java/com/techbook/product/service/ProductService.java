package com.techbook.product.service;

import com.techbook.product.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    public List<Product> getAllProducts() {
        return List.of(
                new Product(1L, "Spring Boot in Action", 499.0),
                new Product(2L, "Java Microservices", 699.0)
        );
    }
}
