package com.paymentshooz.checkpayment.entity;

import jakarta.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private int orders_id;

    @ManyToOne
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    private Users user_id;

    @Column(name = "orders_totalamount")
    private double orders_totalamount;

    @Column(name = "orders_status")
    private String orders_status;

    @Column(name = "orders_datetime")
    private Date orders_datetime;

    @Column(name = "orders_shipdatetime")
    private Date orders_shipdatetime;

    @Column(name = "orders_arrivedatetime")
    private Date orders_arrivedatetime;

    @ManyToOne
    @JoinColumn(name = "fk_admin_id", referencedColumnName = "admin_id")
    private Admin admin_id;

    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public Users getUser_id() {
        return user_id;
    }

    public void setUser_id(Users user_id) {
        this.user_id = user_id;
    }

    public double getOrders_totalamount() {
        return orders_totalamount;
    }

    public void setOrders_totalamount(double orders_totalamount) {
        this.orders_totalamount = orders_totalamount;
    }

    public String getOrders_status() {
        return orders_status;
    }

    public void setOrders_status(String orders_status) {
        this.orders_status = orders_status;
    }

    public Date getOrders_datetime() {
        return orders_datetime;
    }

    public void setOrders_datetime(Date orders_datetime) {
        this.orders_datetime = orders_datetime;
    }

    public Date getOrders_shipdatetime() {
        return orders_shipdatetime;
    }

    public void setOrders_shipdatetime(Date orders_shipdatetime) {
        this.orders_shipdatetime = orders_shipdatetime;
    }

    public Date getOrders_arrivedatetime() {
        return orders_arrivedatetime;
    }

    public void setOrders_arrivedatetime(Date orders_arrivedatetime) {
        this.orders_arrivedatetime = orders_arrivedatetime;
    }

    public Admin getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Admin admin_id) {
        this.admin_id = admin_id;
    }


    @OneToMany(mappedBy = "orders", cascade = CascadeType.ALL)
    private List<OrdersItem> orderItems;

    public List<OrdersItem> getOrderItems() {
        return orderItems;
    }

    public void setOrderItems(List<OrdersItem> orderItems) {
        this.orderItems = orderItems;
    }
}