package com.group1.shooz.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.JoinColumn;

import java.util.Date;

@Entity
@Table(name = "orders")
public class OrderId {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderId;
    @ManyToOne
    @JoinColumn(name = "fk_user_id", referencedColumnName = "UserId")
    private ManageUser user;
    @Column(name = "orders_totalamount")
    private double orderTotalAmount;
    @Column(name = "orders_status")
    private String orderStatus;
    @Column(name = "orders_datetime")
    private Date ordersDatetime;
    @Column(name = "orders_shipdatetime")
    private Date ordersShipDatetime;
    @Column(name = "orders_arriveddatetime")
    private Date ordersArriveDatetime;
    @ManyToOne
    @JoinColumn(name = "fk_admin_id", referencedColumnName = "adminId")
    private ManageAdmin admin;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public ManageUser getUser() {
        return user;
    }

    public void setUser(ManageUser user) {
        this.user = user;
    }

    public double getOrderTotalAmount() {
        return orderTotalAmount;
    }

    public void setOrderTotalAmount(double orderTotalAmount) {
        this.orderTotalAmount = orderTotalAmount;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrdersDatetime() {
        return ordersDatetime;
    }

    public void setOrdersDatetime(Date ordersDatetime) {
        this.ordersDatetime = ordersDatetime;
    }

    public Date getOrdersShipDatetime() {
        return ordersShipDatetime;
    }

    public void setOrdersShipDatetime(Date ordersShipDatetime) {
        this.ordersShipDatetime = ordersShipDatetime;
    }

    public Date getOrdersArriveDatetime() {
        return ordersArriveDatetime;
    }

    public void setOrdersArriveDatetime(Date ordersArriveDatetime) {
        this.ordersArriveDatetime = ordersArriveDatetime;
    }

    public ManageAdmin getAdmin() {
        return admin;
    }

    public void setAdmin(ManageAdmin admin) {
        this.admin = admin;
    }
}
