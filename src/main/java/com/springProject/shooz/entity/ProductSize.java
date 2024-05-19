package com.springProject.shooz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productsize")
public class ProductSize {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productsize_id")
    private int productsize_id;

    @Column(name = "product_size")
    private String product_size;

    // Getters and Setters


    public int getProductsize_id() {
        return productsize_id;
    }

    public void setProductsize_id(int productsize_id) {
        this.productsize_id = productsize_id;
    }

    public String getProduct_size() {
        return product_size;
    }

    public void setProduct_size(String product_size) {
        this.product_size = product_size;
    }
}
