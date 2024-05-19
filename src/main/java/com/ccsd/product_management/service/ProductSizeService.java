package com.ccsd.product_management.service;
import com.ccsd.product_management.entity.ProductSize;
import java.util.List;

public interface ProductSizeService {
    List<ProductSize> getAllProductSize();
    ProductSize getProductSizeById(Integer productsize_id);
    void saveProductSize(ProductSize productSize);
    void deleteProductSize(Integer productsize_id);
}
