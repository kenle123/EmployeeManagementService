package com.kale.employeemanagementservice.EmployeeManagementService.repository;

import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

}
