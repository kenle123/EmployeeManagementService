package com.kale.employeemanagementservice.EmployeeManagementService.service;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Employee;
import com.kale.employeemanagementservice.EmployeeManagementService.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

@Configuration
public class EmployeeConfig {

    @Bean
    CommandLineRunner commandLineRunner(EmployeeRepository repository) {
        return args -> {
            Employee Ken = new Employee(1, "Ken Le", "Male", 15, 50000, "Software Engineer");
            Employee Allen = new Employee(2, "Allen Le", "Male", 14, 25000, "Application Developer");

            repository.saveAll(List.of(Ken, Allen));
        };
    }
}
