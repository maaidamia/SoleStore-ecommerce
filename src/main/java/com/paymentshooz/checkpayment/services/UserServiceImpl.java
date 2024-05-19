package com.paymentshooz.checkpayment.services;

import com.paymentshooz.checkpayment.entity.*;
import com.paymentshooz.checkpayment.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private OrdersItemRepository ordersItemRepository;

    @Autowired ProductRepository productRepository;

    @Autowired
    public UserServiceImpl(OrdersRepository ordersRepository, OrdersItemRepository ordersItemRepository) {
        this.ordersRepository = ordersRepository;
        this.ordersItemRepository = ordersItemRepository;
    }

    @Override
    public List<Users> getAllUsers() {
        return usersRepository.findAll();
    }

    @Override
    public Users getUserById(int user_id) {
        return usersRepository.findById(user_id).orElse(null);
    }

    @Override
    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    @Override
    public Orders getOrdersById(int orders_id) {
        return ordersRepository.findById(orders_id).orElse(null);
    }

    @Override
    public List<OrdersItem> getAllOrderItems() {
        return ordersItemRepository.findAll();
    }

    @Override
    public OrdersItem getOrderItemById(int orderItemId) {
        return ordersItemRepository.findById(orderItemId).orElse(null);
    }

    @Override
    public List<Product> getAllProduct() {
        return productRepository.findAll();
    }


}
