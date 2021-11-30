package com.kale.employeemanagementservice.EmployeeManagementService.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table
public class Employee {

    @GenericGenerator(name="system-uuid", strategy = "uuid")
    @SequenceGenerator(
            name = "employee_sequence",
            sequenceName = "employee_sequence",
            allocationSize = 1
    )

    private String name;
    private String gender;
    private int age;
    @Id
    private Integer id;
    private int salary;
    private String position;

    public Employee(String name, String gender, int age, int id, int salary, String position) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.id = id;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}






