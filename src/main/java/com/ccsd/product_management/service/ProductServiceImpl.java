package com.ccsd.product_management.service;

import com.ccsd.product_management.entity.Product;
import com.ccsd.product_management.repository.ProductRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getUniqueProducts() {
        List<Product> allProducts = productRepository.findAll();
        return allProducts.stream()
                .collect(Collectors.groupingBy(product -> product.getFk_productname_id().getProduct_name()))
                .values()
                .stream()
                .map(products -> products.get(0))
                .collect(Collectors.toList());
    }

    @Override
    public Product getProductById(Integer product_id) {
        return productRepository.findById(product_id).orElse(null);
    }

    @Override
    public void saveProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Integer product_id) {
        productRepository.deleteById(product_id);
    }


}
