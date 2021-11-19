package com.kale.employeemanagementservice.EmployeeManagementService.service;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    public List<Employee> getEmployee() {
        return List.of(new Employee("Ken Le", "Male", 12, 1, 50000, "Software Engineer"),
                       new Employee("Allen Le", "Male", 10, 2, 25000, "Application Developer"));
    }
}
