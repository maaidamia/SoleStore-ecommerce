package com.springProject.shooz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @ManyToOne
    @JoinColumn(name = "fk_productname_id", referencedColumnName = "productname_id")
    private ProductName product_name;

    @ManyToOne
    @JoinColumn(name = "fk_brand_id", referencedColumnName = "brand_id")
    private Brand brand;

    @ManyToOne
    @JoinColumn(name = "fk_productsize_id", referencedColumnName = "productsize_id")
    private ProductSize productSize;

    @Column(name = "product_price")
    private Double product_price;

    @Column(name = "product_image")
    private String product_image;

    @Column(name = "product_quantity")
    private String product_quantity;

    @Column(name = "product_description")
    private String product_description;

    @ManyToOne
    @JoinColumn(name = "fk_administrator_id", referencedColumnName = "admin_id")
    private Administrator administrator;

    // Getters and Setters

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public ProductName getProduct_name() {
        return product_name;
    }

    public void setProduct_name(ProductName product_name) {
        this.product_name = product_name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductSize getProductSize() {
        return productSize;
    }

    public void setProductSize(ProductSize productSize) {
        this.productSize = productSize;
    }

    public Double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Double product_price) {
        this.product_price = product_price;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}

