package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import com.kale.employeemanagementservice.EmployeeManagementService.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/admin")

public class AdminController {

    private final AdminService adminService;

    @Autowired
    public AdminController(AdminService adminService) {
        this.adminService = adminService;
    }

    @GetMapping
    public List<Admin> getAdmin() {
        return adminService.getAdmin();
    }

    @PostMapping
    public void registerNewAdmin(@RequestBody Admin admin) {
        adminService.addNewAdmin(admin);
    }

    @DeleteMapping(path = "{adminId}")
    public void deleteEmployee(@PathVariable("adminId") Integer adminId) {
        adminService.deleteAdmin(adminId);
    }
}
