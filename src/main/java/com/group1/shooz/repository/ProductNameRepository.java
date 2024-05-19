package com.group1.shooz.repository;

import com.group1.shooz.model.ProductName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductNameRepository extends JpaRepository<ProductName, Long> {
}
