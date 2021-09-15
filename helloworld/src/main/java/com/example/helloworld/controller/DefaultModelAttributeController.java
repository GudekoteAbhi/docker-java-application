package com.example.helloworld.controller;

import com.example.helloworld.Model.Employee;
import com.example.helloworld.Model.Login;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;

@ControllerAdvice
public class DefaultModelAttributeController {
    @ModelAttribute("newuser")
    public Employee getDefaultEmployee(){
        return new Employee();
    }

    @ModelAttribute("loginuser")
    public Login getDefaultUser(){
        return new Login();
    }
}
