package com.group1.shooz.service.serviceimpl;

import com.group1.shooz.model.ManageProduct;
import com.group1.shooz.model.ProductName;
import com.group1.shooz.repository.ProductNameRepository;
import com.group1.shooz.repository.ProductRepository;
import com.group1.shooz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductNameRepository productNameRepository;

    @Override
    public List<ManageProduct> getAllProduct(){
        return productRepository.findAll();
    }

    @Override
    public void createProduct(ManageProduct product) {
        this.productRepository.save(product);
    }

    @Override
    public ManageProduct saveProduct(ManageProduct product) {
        ProductName productName = product.getProductName();
        // Check if productName is not null and if it is not yet saved (ID is 0, the default int value)
        if (productName != null && productName.getProductNameId() == 0) {
            //Save the ProductName entity first
            productNameRepository.save(productName);
        }
        // Now save the ManageProduct entity
        return productRepository.save(product);
//        this.productRepository.save(product);
    }
}
