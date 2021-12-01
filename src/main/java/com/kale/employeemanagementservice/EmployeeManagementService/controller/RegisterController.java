package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.logging.Logger;

@Controller
public class RegisterController {
    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("admin", new Admin());
        return "register";
    }

    @PostMapping("/register")
    public String postRegisterCredentials(@ModelAttribute Admin admin, Model model) {
        String email = admin.getEmail();
        String password = admin.getPassword();

        System.out.println("email is: " + email + " password is: " + password);
        return "register";
    }
}
