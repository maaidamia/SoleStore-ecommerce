package com.group1.shooz.service;

import com.group1.shooz.model.ManageOrder;
import com.group1.shooz.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<ManageOrder> getAllOrder(){
        return orderRepository.findAll();
    }
}
