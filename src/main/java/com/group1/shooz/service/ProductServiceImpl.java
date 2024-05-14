package com.group1.shooz.service;

import com.group1.shooz.model.ManageProduct;
import com.group1.shooz.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<ManageProduct> getAllProduct(){
        return productRepository.findAll();
    }
}
