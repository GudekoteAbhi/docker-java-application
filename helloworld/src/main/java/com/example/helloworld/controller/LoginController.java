package com.example.helloworld.controller;

import com.example.helloworld.Exception.ApplicationException;
import com.example.helloworld.Model.Employee;
import com.example.helloworld.Model.Login;
import com.example.helloworld.Model.OrganizationInfo;
import com.example.helloworld.Repository.EmployeeJpaRepository;
import com.example.helloworld.Repository.OrganizationInfoJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {
    @Autowired
    private EmployeeJpaRepository employeeRepository;

    @Autowired
    private OrganizationInfoJpaRepository organizationInfoRepository;

    @PostMapping("/login")
    public String login(@ModelAttribute("loginuser")Login login, BindingResult result, Model model){
        System.out.println("inside login controller");
        System.out.println("login :"+login);
        if(result.hasErrors()){
            return "login";
        }
        else {
            Employee emp = employeeRepository.findByContact(login.getContact());
            if(null == emp){
                throw new ApplicationException("user not found");
            }else {
                System.out.println("inside else part");
                OrganizationInfo organizationInfo = organizationInfoRepository.findByContact(login.getContact());
                //List<Employee> users = new ArrayList<>(employeeRepository.findAll());
                System.out.println("found users "+organizationInfo);
                model.addAttribute("users",organizationInfo);
                return "display-user";
            }
        }
    }

    @ExceptionHandler(ApplicationException.class)
    public String handleException(){
        System.out.println("inside handle exception");
        return "error";
    }
}