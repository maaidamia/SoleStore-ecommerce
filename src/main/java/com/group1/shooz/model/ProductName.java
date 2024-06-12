package com.group1.shooz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;

@Entity
@Table(name = "productname")
public class ProductName {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productNameId;

    @Column(name = "product_name")
    private String productName;

    public int getProductNameId() {
        return productNameId;
    }

    public void setProductNameId(int productNameId) {
        this.productNameId = productNameId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
