package com.kale.employeemanagementservice.EmployeeManagementService.service;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import com.kale.employeemanagementservice.EmployeeManagementService.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    private final AdminRepository adminRepository;

    @Autowired
    public AdminService(AdminRepository adminRepository) {
        this.adminRepository = adminRepository;
    }

    public List<Admin> getAdmin() {
        return adminRepository.findAll();
    }

    public void addNewAdmin(Admin admin) {
        adminRepository.save(admin);
    }

    public void deleteAdmin(int adminId) {
        boolean exists = adminRepository.existsById(adminId);
        if(!exists) {
            throw new IllegalStateException("Admin with id: " + adminId + " does not exist");
        }
        adminRepository.deleteById(adminId);
    }
}
