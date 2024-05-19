package com.group1.shooz.service.serviceimpl;

import com.group1.shooz.model.ProductSize;
import com.group1.shooz.repository.ProductSizeRepository;
import com.group1.shooz.service.ProductSizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductSizeServiceImpl implements ProductSizeService {
    @Autowired
    private ProductSizeRepository productSizeRepository;

    @Override
    public List<ProductSize> getAllSize() {
        return productSizeRepository.findAll();
    }
}
