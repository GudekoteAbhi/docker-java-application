package com.example.helloworld.controller;

import com.example.helloworld.Model.Employee;
import com.example.helloworld.Repository.EmployeeJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.naming.Binding;
import java.util.ArrayList;
import java.util.List;

@Controller
public class RegistrationController {

    @Autowired
    private EmployeeJpaRepository employeeRepository;

    @PostMapping("/registeruser")
    public String registerUser(@ModelAttribute("newuser")Employee employee, BindingResult result, Model model){
        System.out.println("in registration control");
        System.out.println("user :"+employee);
        if(result.hasErrors()){
            return "register";
        }
        else {
            Employee emp = employeeRepository.findByContact(employee.getContact());
            if(emp != null){
                System.out.println("employee already exist");
                return "error";
            }else {
                employeeRepository.saveAndFlush(employee);
                return "login";
            }

        }
    }
}
