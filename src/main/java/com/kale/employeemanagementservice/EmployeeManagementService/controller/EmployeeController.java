package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Employee;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeeController {
    @GetMapping("api/v1/employee")
    public List<Employee> getEmployee() {
        return List.of(new Employee("Bob Jones", "Male", 22, 99999, 25000, "Janitor"));
    }
}
