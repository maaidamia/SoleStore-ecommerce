package com.ccsd.product_management.service;

import com.ccsd.product_management.entity.ProductName;
import com.ccsd.product_management.repository.ProductNameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductNameServiceImpl implements ProductNameService {

    @Autowired
    private ProductNameRepository productNameRepository;

    @Override
    public List<ProductName> getAllProductName() {
        return productNameRepository.findAll();
    }

    @Override
    public ProductName getProductNameById(Integer productname_id) {
        return productNameRepository.findById(productname_id).orElse(null);
    }

    @Override
    public void saveProductName(ProductName productName) {
        productNameRepository.save(productName);
    }

    @Override
    public void deleteProductName(Integer productname_id) {
        productNameRepository.deleteById(productname_id);
    }
}
