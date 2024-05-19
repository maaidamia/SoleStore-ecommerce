package com.ccsd.product_management.repository;

import com.ccsd.product_management.entity.ProductName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductNameRepository extends JpaRepository<ProductName, Integer>{
}
