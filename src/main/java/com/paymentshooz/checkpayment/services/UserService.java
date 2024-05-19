package com.paymentshooz.checkpayment.services;

import com.paymentshooz.checkpayment.entity.*;

import java.util.List;

public interface UserService {
    List<Users> getAllUsers();
    Users getUserById(int user_id);

    List<Orders> getAllOrders();
    Orders getOrdersById(int orders_id);

    List<OrdersItem> getAllOrderItems();
    OrdersItem getOrderItemById(int orderItemId);

    List<Product> getAllProduct();

}
