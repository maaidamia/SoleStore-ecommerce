package com.paymentshooz.checkpayment.repository;

import com.paymentshooz.checkpayment.entity.ProductSize;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductSizeRepository extends JpaRepository <ProductSize, Integer> {
}
