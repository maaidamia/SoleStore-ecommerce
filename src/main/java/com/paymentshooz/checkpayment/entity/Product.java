package com.paymentshooz.checkpayment.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

    @ManyToOne
    @JoinColumn(name = "fk_productname_id", referencedColumnName = "productname_id")
    private ProductName productNameId;

    @ManyToOne
    @JoinColumn(name = "fk_brand_id", referencedColumnName = "brand_id")
    private Brand brand_id;

    @ManyToOne
    @JoinColumn(name = "fk_productsize_id", referencedColumnName = "productsize_id")
    private ProductSize productSizeId;

    @Column(name = "product_price")
    private int product_price;

    @Column(name = "product_image")
    private String product_image;

    @Column(name = "product_quantity")
    private int product_quantity;

    @Column(name = "product_description")
    private String product_description;

    @ManyToOne
    @JoinColumn(name = "fk_admin_id", referencedColumnName = "admin_id")
    private Admin admin_id;

    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public ProductName getProductNameId() {
        return productNameId;
    }

    public void setProductNameId(ProductName productNameId) {
        this.productNameId = productNameId;
    }

    public Brand getBrand_id() {
        return brand_id;
    }

    public void setBrand_id(Brand brand_id) {
        this.brand_id = brand_id;
    }

    public ProductSize getProductsize_id() {
        return productSizeId;
    }

    public void setProductsize_id(ProductSize productsize_id) {
        this.productSizeId = productsize_id;
    }

    public int getProduct_price() {
        return product_price;
    }

    public void setProduct_price(int product_price) {
        this.product_price = product_price;
    }

    public String getProduct_image() {
        return product_image;
    }

    public void setProduct_image(String product_image) {
        this.product_image = product_image;
    }

    public int getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(int product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Admin getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Admin admin_id) {
        this.admin_id = admin_id;
    }



    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrdersItem> orderItems;

    public List<OrdersItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrdersItem> orderItems) {
        this.orderItems = orderItems;
    }
}