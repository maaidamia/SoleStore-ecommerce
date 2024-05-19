package com.ccsd.product_management.service;
import com.ccsd.product_management.entity.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Integer product_id);
    void saveProduct(Product product);
    void deleteProduct(Integer product_id);
    List<Product> getUniqueProducts();



}
