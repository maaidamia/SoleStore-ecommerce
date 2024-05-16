package com.group1.shooz.repository;

import com.group1.shooz.model.ManageOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<ManageOrder, Long> {
}
