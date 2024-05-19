package com.ccsd.product_management.controller;

import com.ccsd.product_management.entity.Product;
import com.ccsd.product_management.entity.ProductName;
import com.ccsd.product_management.service.ProductService;
import com.ccsd.product_management.service.ProductNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private ProductNameService productNameService;

    // Handler method to display a list of products
    @GetMapping("/")
    public String showProductList(Model model) {
        // Retrieve list of unique products from the ProductService
        List<Product> productList = productService.getUniqueProducts();

        // Add the list of products to the model
        model.addAttribute("products", productList);

        // Return the name of the Thymeleaf template to render
        return "index";
    }

//    @GetMapping("/product_details/{id}")
//    public String nextPage(@PathVariable(value = "id")Integer productName, Model model) {
//        // Retrieve the product or any other logic
//        ProductName productList = productNameService.getProductNameById(productName);
//        Product productPrice = productService.getProductById(productName);
//        model.addAttribute("product", productList); //product refers to productname table
//        model.addAttribute("product2", productPrice); //product2 refers to product table
//        return "product_details"; // The name of your Thymeleaf template for the next page
//    } //comment sementara

//    @GetMapping("/product_details/{id}")
//    public String nextPage(@PathVariable(value = "id")Integer productName, Model model) {
//        // Retrieve the product or any other logic
////        ProductName productList = productNameService.getProductNameById(productName);
//        Product productDetail = productService.getProductById(productName);
////        model.addAttribute("product", productList); //product refers to productname table
//        model.addAttribute("product", productDetail); //product2 refers to product table
//        return "product_details"; // The name of your Thymeleaf template for the next page
//    }


}
