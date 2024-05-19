package com.springProject.shooz.service;

import com.springProject.shooz.entity.Order;
import com.springProject.shooz.entity.OrderItem;
import com.springProject.shooz.exception.ResourceNotFoundException;
import com.springProject.shooz.repository.OrderItemRepository;
import com.springProject.shooz.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    @Autowired
    private OrderRepository orderRepository;

    public List<OrderItem> getOrderItemsByOrderId(int orderId) {
        Order order = orderRepository.findById(orderId).orElseThrow(() -> new ResourceNotFoundException("Order not found"));
        return orderItemRepository.findByOrder(order);
    }

    public void deleteOrderItemById(int id) {
        orderItemRepository.deleteById(id);
    }
}
