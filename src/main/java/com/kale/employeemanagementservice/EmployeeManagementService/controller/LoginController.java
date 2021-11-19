package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
    // Login screen
    @GetMapping("/login")
    public String temp2(@RequestParam(name = "name", required = false, defaultValue = "Ken") String name, Model model) {
        model.addAttribute("name", name);
        return "login";
    }


}
