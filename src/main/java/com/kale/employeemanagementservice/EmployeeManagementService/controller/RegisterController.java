package com.kale.employeemanagementservice.EmployeeManagementService.controller;
import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import com.kale.employeemanagementservice.EmployeeManagementService.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.SQLException;

@Controller
public class RegisterController  {

    private final AdminService adminService;

    @Autowired
    public RegisterController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("admin", new Admin());
        return "register";
    }

    @PostMapping("/register")
    public String postRegisterCredentials(@ModelAttribute @RequestBody Admin admin, Model model) {
        adminService.addNewAdmin(admin);
        return "register";
    }
}
