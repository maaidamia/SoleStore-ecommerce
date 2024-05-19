package com.ccsd.product_management.service;

import com.ccsd.product_management.entity.Brand;
import com.ccsd.product_management.repository.BrandRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandRepository brandRepository;

    @Override
    public List<Brand> getAllBrand() {
        return brandRepository.findAll();
    }

    @Override
    public Brand getBrandById(Integer brand_id) {
        return brandRepository.findById(brand_id).orElse(null);
    }

    @Override
    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }

    @Override
    public void deleteBrand(Integer brand_id) {
        brandRepository.deleteById(brand_id);
    }
}



