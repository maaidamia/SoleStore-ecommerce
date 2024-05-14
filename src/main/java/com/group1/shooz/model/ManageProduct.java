package com.group1.shooz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

@Entity
@Table(name = "product")
public class ManageProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    @ManyToOne
    @JoinColumn(name = "fk_productname_id", referencedColumnName = "productNameId")
    private ProductName productName;
    @ManyToOne
    @JoinColumn(name = "fk_brand_id", referencedColumnName = "brandId")
    private Brand brand;
    @ManyToOne
    @JoinColumn(name = "fk_productsize_id", referencedColumnName = "productSizeId")
    private ProductSize size;
    @Column(name = "product_price")
    private double productPrice;
    @Column(name = "product_image")
    private String productImage;
    @Column(name = "product_quantity")
    private int productQuantity;
    @Column(name = "product_description")
    private String productDesc;
    @ManyToOne
    @JoinColumn(name = "fk_admin_id", referencedColumnName = "adminId")
    private ManageAdmin admin;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public ProductSize getSize() {
        return size;
    }

    public void setSize(ProductSize size) {
        this.size = size;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductImage() {
        return productImage;
    }

    public void setProductImage(String productImage) {
        this.productImage = productImage;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    public ManageAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ManageAdmin admin) {
        this.admin = admin;
    }
}
