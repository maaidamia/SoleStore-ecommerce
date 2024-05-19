package com.ccsd.product_management.service;
import com.ccsd.product_management.entity.ProductName;
import java.util.List;

public interface ProductNameService {
    List<ProductName> getAllProductName();
    ProductName getProductNameById(Integer productname_id);
    void saveProductName(ProductName productName);
    void deleteProductName(Integer productname_id);
}



