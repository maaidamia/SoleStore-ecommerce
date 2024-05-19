package com.group1.shooz.controller;

import com.group1.shooz.model.ManageProduct;
import com.group1.shooz.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProductService productService;
    @Autowired
    private BrandService brandService;
    @Autowired
    private ProductSizeService productSizeService;
    @Autowired
    private UserService userService;
    @Autowired
    private OrderService orderService;

    //homepage aka index page
    @GetMapping("/")
    public String adminDashboard(){
        return "admin/index";
    }
    @GetMapping("/index")
    public String adminIndex(){
        return "admin/index";
    }

    //PRODUCT
//    READ
    @GetMapping("/manage-product")
    public String readProduct(Model model){
        //show list of product
        model.addAttribute("listProduct", productService.getAllProduct());
        return "admin/manage-product";
    }

//    CREATE
    //method to show the form
    @GetMapping("/manage-product-form")
    public String createProduct(Model model){
        //create model attribute attribute to bind form data
        ManageProduct product = new ManageProduct();
        model.addAttribute("createProduct", product);

        //show list of brands
        model.addAttribute("brandsObj", brandService.getAllBrand());
        //show list of size
        model.addAttribute("productsizeObj", productSizeService.getAllSize());
        return "admin/manage-product-add";
    }

    //method to handle the form submission
    @PostMapping("/manage-product-add")
    public String saveProduct(@ModelAttribute("product") ManageProduct product){
        //save product to database
        productService.saveProduct(product);
        return "redirect:/admin/manage-product";
    }

    @GetMapping("/manage-order")
    public String manageOrder(Model model){
        model.addAttribute("listOrder", orderService.getAllOrder());
        return "admin/manage-order";
    }


    @GetMapping("/manage-user")
    public String manageUser(Model model){
        model.addAttribute("listUser", userService.getAllUser());
        return "admin/manage-user";
    }

    //display list of admin
    @GetMapping("/manage-admin")
    public String manageAdmin(Model model){
        model.addAttribute("listAdmin", adminService.getAllAdmin());
        return "admin/manage-admin";
    }
}
