package com.springProject.shooz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "productname")
public class ProductName {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "productname_id")
    private int productname_id;

    @Column(name = "product_name")
    private String product_name;

    //Getter Setter

    public int getProductname_id() {
        return productname_id;
    }

    public void setProductname_id(int productname_id) {
        this.productname_id = productname_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }
}
