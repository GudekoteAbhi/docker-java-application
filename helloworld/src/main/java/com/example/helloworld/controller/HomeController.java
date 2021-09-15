package com.example.helloworld.controller;

import com.example.helloworld.Model.Employee;
import com.example.helloworld.Model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String goToHome(){
        System.out.println("in home controller");
        return "index";
    }

    @GetMapping("/goToRegistration")
    public String goToRegistration(){
        System.out.println("going to register user page");
        return "register";
    }

    @GetMapping("/goToDisplayUser")
    public String goToDisplayUser(){
        System.out.println("going to display user page");
        return "display-user";
    }
    @GetMapping("/goToLogin")
    public String goToLogin(){
        System.out.println("going to login user page");
        return "login";
    }

}
