package com.ecommerce.easecart.service;

import com.ecommerce.easecart.model.OrderDto;
import com.ecommerce.easecart.model.OrderResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface OrderService {
    OrderResponse getOrderById(Integer orderId);

    List<OrderResponse> getAllOrders();

    Page<OrderResponse> getAllOrders(Pageable pageable);

    Integer createOrder(OrderDto order);

    void deleteOrder(Integer orderId);
}
