package com.springProject.shooz.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders_item")
public class OrderItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_item_id")
    private int orders_item_id;

    @ManyToOne
    @JoinColumn(name = "fk_orders_id", referencedColumnName = "orders_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "fk_product_id", referencedColumnName = "product_id")
    private Product product;

    @Column(name = "orders_items_productquantity")
    private Integer order_items_productquantity;

    // Getters and Setters


    public int getOrders_item_id() {
        return orders_item_id;
    }

    public void setOrders_item_id(int orders_item_id) {
        this.orders_item_id = orders_item_id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Integer getOrder_items_productquantity() {
        return order_items_productquantity;
    }

    public void setOrder_items_productquantity(Integer order_items_productquantity) {
        this.order_items_productquantity = order_items_productquantity;
    }
}

