package com.ccsd.product_management.service;

import com.ccsd.product_management.entity.ProductSize;
import com.ccsd.product_management.repository.ProductSizeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductSizeServiceImpl implements ProductSizeService {

    @Autowired
    private ProductSizeRepository productSizeRepository;

    @Override
    public List<ProductSize> getAllProductSize() {
        return productSizeRepository.findAll();
    }

    @Override
    public ProductSize getProductSizeById(Integer productsize_id) {
        return productSizeRepository.findById(productsize_id).orElse(null);
    }

    @Override
    public void saveProductSize(ProductSize productSize) {
        productSizeRepository.save(productSize);
    }

    @Override
    public void deleteProductSize(Integer productsize_id) {
        productSizeRepository.deleteById(productsize_id);
    }
}
