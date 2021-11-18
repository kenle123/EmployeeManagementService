package com.kale.employeemanagementservice.EmployeeManagementService.controller;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
public class EmployeeService {

    public List<Employee> getEmployee() {
        return List.of(new Employee("Bob Jones", "Male", 22, 99999, 25000, "Janitor"));
    }
}
