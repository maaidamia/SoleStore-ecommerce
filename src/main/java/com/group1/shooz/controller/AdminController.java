package com.group1.shooz.controller;

import com.group1.shooz.model.ManageProduct;
import com.group1.shooz.service.AdminService;
import com.group1.shooz.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private ProductService productService;

    //homepage aka index page
    @GetMapping("/")
    public String adminDashboard(){
        return "admin/index";
    }
    @GetMapping("/index")
    public String adminIndex(){
        return "admin/index";
    }

    @GetMapping("/manage-product")
    public String manageProduct(Model model){
        model.addAttribute("listProduct", productService.getAllProduct());
        return "admin/manage-product";
    }


    @GetMapping("/manage-order")
    public String manageOrder(){
        return "admin/manage-order";
    }


    @GetMapping("/manage-user")
    public String manageUser(){
        return "admin/manage-user";
    }

    //display list of admin
    @GetMapping("/manage-admin")
    public String manageAdmin(Model model){
        model.addAttribute("listAdmin", adminService.getAllAdmin());
        return "admin/manage-admin";
    }
}
