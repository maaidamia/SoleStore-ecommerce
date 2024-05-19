package com.paymentshooz.checkpayment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "orders_item")
public class OrdersItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_item_id")
    private int orders_item_id;

    @ManyToOne
    @JoinColumn(name = "fk_orders_id", referencedColumnName = "orders_id")
    private Orders orders;

    @ManyToOne
    @JoinColumn(name = "fk_product_id", referencedColumnName = "product_id")
    private Product product;

    @Column(name = "orders_items_productquantity")
    private int ordersitem_quantity;

    public int getOrders_item_id() {
        return orders_item_id;
    }

    public void setOrders_item_id(int orders_item_id) {
        this.orders_item_id = orders_item_id;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getOrdersitem_quantity() {
        return ordersitem_quantity;
    }

    public void setOrdersitem_quantity(int ordersitem_quantity) {
        this.ordersitem_quantity = ordersitem_quantity;
    }
}
