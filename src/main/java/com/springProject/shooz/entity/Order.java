package com.springProject.shooz.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orders_id")
    private int orders_id;

    @ManyToOne
    @JoinColumn(name = "fk_user_id", referencedColumnName = "user_id")
    private User user;

    @Column(name = "orders_totalamount")
    private Double orders_totalamount;

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
    private Administrator administrator;



    // Getters and Setters


    public int getOrders_id() {
        return orders_id;
    }

    public void setOrders_id(int orders_id) {
        this.orders_id = orders_id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getOrders_totalamount() {
        return orders_totalamount;
    }

    public void setOrders_totalamount(Double orders_totalamount) {
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

    public Administrator getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator administrator) {
        this.administrator = administrator;
    }
}

