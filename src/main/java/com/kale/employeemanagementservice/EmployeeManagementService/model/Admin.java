package com.kale.employeemanagementservice.EmployeeManagementService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Admin {
    @Id
    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @SequenceGenerator(
            name = "admin_sequence",
            sequenceName = "admin_sequence",
            allocationSize = 1
    )

    private Integer id;
    private String email;
    private String password;

    public Admin(Integer id, String email, String password) {
        this.email = email;
        this.password = password;
    }

    public Admin() {}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
