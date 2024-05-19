package com.paymentshooz.checkpayment.repository;

import com.paymentshooz.checkpayment.entity.ProductName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductNameRepository extends JpaRepository <ProductName, Integer> {
}
