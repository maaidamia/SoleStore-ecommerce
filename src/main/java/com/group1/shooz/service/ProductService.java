package com.group1.shooz.service;

import com.group1.shooz.model.ManageProduct;

import java.util.List;

public interface ProductService {
    List<ManageProduct> getAllProduct();

    void createProduct(ManageProduct product);
    ManageProduct saveProduct(ManageProduct product);

}
