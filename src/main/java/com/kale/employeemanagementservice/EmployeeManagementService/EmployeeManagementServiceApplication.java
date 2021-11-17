package com.kale.employeemanagementservice.EmployeeManagementService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class EmployeeManagementServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeManagementServiceApplication.class, args);
	}
}
