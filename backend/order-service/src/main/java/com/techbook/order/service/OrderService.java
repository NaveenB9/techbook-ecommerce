package com.techbook.order.service;

import com.techbook.order.model.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    public List<Order> getOrders() {
        return List.of(
                new Order(1L, 1L, 1L, 2),
                new Order(2L, 2L, 2L, 1)
        );
    }

    public Order createOrder(Order order) {
        order.setOrderId(100L);
        return order;
    }
}
