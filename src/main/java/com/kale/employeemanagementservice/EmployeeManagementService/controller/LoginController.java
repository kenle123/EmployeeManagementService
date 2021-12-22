package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("admin", new Admin());
        return "login";
    }

    @PostMapping("/login")
    public String postLoginCredentials(@ModelAttribute Admin admin, Model model) {
        String email = admin.getEmail();
        String password = admin.getPassword();

        if(email.equals("admin") && password.equals("admin")) {
            model.addAttribute("invalidCredential", false);
            return "home";
        }

        model.addAttribute("invalidCredential", true);
        return "login";
    }
}
