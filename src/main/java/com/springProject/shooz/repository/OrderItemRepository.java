package com.springProject.shooz.repository;

import com.springProject.shooz.entity.Order;
import com.springProject.shooz.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {
    List<OrderItem> findByOrder(Order order);

//    List<OrderItem> findByOrderId(int orderId);

//    List<OrderItem> findByOrderOrderId(Integer orderId);
}
