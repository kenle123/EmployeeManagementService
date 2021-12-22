package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import com.kale.employeemanagementservice.EmployeeManagementService.service.AdminService;
import com.kale.employeemanagementservice.EmployeeManagementService.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class LoginController {

    private final AdminService adminService;

    @Autowired
    public LoginController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping("/login")
    public String getLoginPage(Model model) {
        model.addAttribute("admin", new Admin());
        return "login";
    }

    @PostMapping("/login")
    public String postLoginCredentials(@ModelAttribute Admin admin, Model model) {

        List<Admin> adminList = adminService.getAdmin();
        for(Admin a : adminList) {
            System.out.println(a.getEmail() + "  " + a.getPassword());
        }

//        String email = admin.getEmail();
//        String password = admin.getPassword();



//        if(email.equals("admin") && password.equals("admin")) {
//            model.addAttribute("invalidCredential", false);
//            return "home";
//        }

        model.addAttribute("invalidCredential", true);
        return "login";
    }
}
