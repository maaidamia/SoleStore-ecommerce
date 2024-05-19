package com.paymentshooz.checkpayment.repository;


import com.paymentshooz.checkpayment.entity.OrdersItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrdersItemRepository extends JpaRepository<OrdersItem, Integer> {
}