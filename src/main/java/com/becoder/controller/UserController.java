package com.becoder.controller;

import com.becoder.dto.UserDto;
import com.becoder.model.User;
import com.becoder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.security.Principal;

@Controller
public class UserController {

    @Autowired
    private UserDetailsService userDetailsService;

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/index")
    public String index(Model model, Principal principal){
        UserDetails userDetails = userDetailsService.loadUserByUsername(principal.getName());
        model.addAttribute("userdetail",userDetails);
        return "index";
    }

    @GetMapping("/login")
    public String login(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "login";
    }



    @GetMapping("/register")
    public String register(Model model, UserDto userDto){
        model.addAttribute("user", userDto);
        return "register";
    }

    @PostMapping("/register")
    public String registerSave(Model model, UserDto userDto){
        User user = userService.findByUserEmail(userDto.getUserEmail());
        if(user != null){
            model.addAttribute("userexist", user);
            return  "register";

        }
        userService.save(userDto);
        return "redirect:/login?success";
    }

}
