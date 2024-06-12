package com.group1.shooz.controller;

import com.group1.shooz.model.ManageProduct;
import com.group1.shooz.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/product-addform")
    public String viewAddProduct(Model model){
        //create model attribute attribute to bind form data
        ManageProduct product = new ManageProduct();
        model.addAttribute("createProduct", product);

        //show list of brands
        model.addAttribute("brandsObj", brandService.getAllBrand());
        return "admin/manage-product-add";
    }

    //method to handle the form submission
    @PostMapping("/product-save")
    public String saveProduct(@ModelAttribute("product") ManageProduct product){
        //save product to database
        productService.saveProduct(product);
        return "redirect:/admin/manage-product";
    }

    //UPDATE
    @GetMapping("/product-updateform/{id}")
    public String viewUpdateProduct(@PathVariable (value="id") long id, Model model){
        //get product from the service
        ManageProduct product = productService.getProductById(id);

        //set product as a model attribute to pre-populate the form
        model.addAttribute("product", product);

        //show list of brands
        model.addAttribute("brandsObj", brandService.getAllBrand());
        return "admin/manage-product-update";
    }

    //DELETE
    @GetMapping("/product-delete/{id}")
    public String deleteProduct(@PathVariable(value="id") long id){
        //call delete product method
        this.productService.deleteProductById(id);
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
