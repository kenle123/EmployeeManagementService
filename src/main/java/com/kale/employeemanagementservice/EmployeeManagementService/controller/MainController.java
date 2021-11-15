package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
    @GetMapping("/")
    public String temp() {
        return "Home Screen";
    }
}
