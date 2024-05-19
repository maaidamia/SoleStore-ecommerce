package com.paymentshooz.checkpayment.controller;

import com.paymentshooz.checkpayment.entity.Orders;
import com.paymentshooz.checkpayment.entity.OrdersItem;
import com.paymentshooz.checkpayment.entity.ProductName;
import com.paymentshooz.checkpayment.entity.Users;
import com.paymentshooz.checkpayment.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class AppController {

    @Autowired
    private UserService userService;

//    @GetMapping("/index")
//    public String getIndex(Model model) {
//        model.addAttribute("users", userService.getAllUsers());
//        return "index";
//    }
//
//    @GetMapping("/user/{id}")
//    public String getUser(@PathVariable("id") int userId, Model model) {
//        Users user = userService.getUserById(userId);
//        Orders orders = userService.getOrdersById(userId);
//        if (user != null) {
//            model.addAttribute("user", user);
//            model.addAttribute("orders", orders);
//            return "user";
//        } else {
//            return "error";
//        }
//    }

    @GetMapping("payment")
    public String getPayment(Integer userId, Model model) {
        Users user = userService.getUserById(2); // Fetch user with ID 1
        Orders orders = userService.getOrdersById(2);

        if (user != null) {
            model.addAttribute("user", user);
            model.addAttribute("orders", orders);
            return "payment";
        } else {
            return "error"; // handle error accordingly
        }
    }

    @GetMapping("receipt")
    public String getReceipt(Integer userId, Model model) {
        Users user = userService.getUserById(2); // Fetch user with ID 1
        if (user != null) {
            model.addAttribute("user", user);
            model.addAttribute("orders", userService.getOrdersById(2));
            model.addAttribute("product", userService.getAllProduct());
            return "receipt";
        } else {
            return "error"; // handle error accordingly
        }
    }

//    @GetMapping("/order")
//    public String getOrder(Model model) {
//        // Fetch all orders
//        model.addAttribute("orders", userService.getAllOrders());
//        model.addAttribute("product", userService.getAllProduct());
//        return "orderDetails";
//    }
//
//    @GetMapping("/orderid")
//    public String getOrderDetails(Model model) {
//        // Fetch all orders
//        model.addAttribute("orders", userService.getOrdersById(1));
//        model.addAttribute("product", userService.getAllProduct());
//        return "orderItems";
//    }

}

