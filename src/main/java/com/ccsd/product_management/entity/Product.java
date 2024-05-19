package com.ccsd.product_management.entity;
import jakarta.persistence.*;

@Entity
@Table(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private int product_id;

//    @Column(name = "product_name")
//    private String product_name;

    @ManyToOne
    @JoinColumn(name = "fk_productname_id")
    private ProductName fk_productname_id;

    @ManyToOne
    @JoinColumn(name = "fk_brand_id")
    private Brand fk_brand_id;

    @ManyToOne
    @JoinColumn(name = "fk_productsize_id")
    private ProductSize fk_productsize_id;

    @Column(name = "product_price")
    private int product_price;

    @Column(name = "product_image")
    private String product_image;

    @Column(name = "product_quantity")
    private int product_quantity;

    @Column(name = "product_description")
    private String product_description;

    @ManyToOne
    @JoinColumn(name = "fk_admin_id")
    private Admin fk_admin_id;

    //Getter setter method
    public int getProduct_id() {
        return product_id;
    }

    public void setProduct_id(int product_id) {
        this.product_id = product_id;
    }

    public void setFk_productname_id(ProductName fk_productname_id) {
        this.fk_productname_id = fk_productname_id;
    }

    public Brand getFk_brand_id() {
        return fk_brand_id;
    }

    public void setFk_brand_id(Brand fk_brand_id) {
        this.fk_brand_id = fk_brand_id;
    }

    public ProductSize getFk_productsize_id() {
        return fk_productsize_id;
    }

    public void setFk_productsize_id(ProductSize fk_productsize_id) {
        this.fk_productsize_id = fk_productsize_id;
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

    public Admin getFk_admin_id() {
        return fk_admin_id;
    }

    public void setFk_admin_id(Admin fk_admin_id) {
        this.fk_admin_id = fk_admin_id;
    }

    public ProductName getFk_productname_id() {
        return fk_productname_id;
    }
}