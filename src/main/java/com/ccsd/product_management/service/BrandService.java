package com.ccsd.product_management.service;
import com.ccsd.product_management.entity.Brand;
import java.util.List;

public interface BrandService {
    List<Brand> getAllBrand();
    Brand getBrandById(Integer brand_id);
    void saveBrand(Brand brand);
    void deleteBrand(Integer brand_id);
}
