package com.group1.shooz.service.serviceimpl;

import com.group1.shooz.model.Brand;
import com.group1.shooz.repository.BrandRepository;
import com.group1.shooz.service.BrandService;
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
}
