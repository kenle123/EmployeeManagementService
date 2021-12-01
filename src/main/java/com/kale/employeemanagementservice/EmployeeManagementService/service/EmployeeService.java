package com.kale.employeemanagementservice.EmployeeManagementService.service;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Employee;
import com.kale.employeemanagementservice.EmployeeManagementService.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public void addNewEmployee(Employee employee) {
        Optional<Employee> employeeOptional = employeeRepository.findEmployeeById(employee.getId());

        if(employeeOptional.isPresent()) {
            throw new IllegalStateException("Id Taken");
        }
        employeeRepository.save(employee);
    }

    public void deleteEmployee(int employeeId) {
        boolean exists = employeeRepository.existsById(employeeId);
        if(!exists) {
            throw new IllegalStateException("Employee with id: " + employeeId + " does not exist");
        }
        employeeRepository.deleteById(employeeId);
    }
}
