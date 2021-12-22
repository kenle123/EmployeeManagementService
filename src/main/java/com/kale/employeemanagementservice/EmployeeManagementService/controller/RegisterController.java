package com.kale.employeemanagementservice.EmployeeManagementService.controller;
import ch.qos.logback.core.net.SyslogOutputStream;
import com.kale.employeemanagementservice.EmployeeManagementService.model.Admin;
import com.kale.employeemanagementservice.EmployeeManagementService.repository.AdminRepository;
import org.hibernate.engine.jdbc.connections.spi.JdbcConnectionAccess;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.concurrent.ThreadLocalRandom;


@Controller
public class RegisterController  {

    @Autowired
    public JdbcTemplate jdbcTemplate;

    @Autowired
    public AdminRepository adminRepository;


    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("admin", new Admin());
        return "register";
    }

    @PostMapping("/register")
    public String postRegisterCredentials(@ModelAttribute @RequestBody Admin admin, Model model) throws SQLException {

        String email = admin.getEmail();
        String password = admin.getPassword();
        int randomNum = ThreadLocalRandom.current().nextInt(0, 100 + 1);

        String insertString = "INSERT INTO admin" + "  (id, email, password) VALUES " + " (?, ?, ?);";

        try(Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/employee", "postgres", "kekw123");

            PreparedStatement preparedStatement = connection.prepareStatement(insertString)) {
            preparedStatement.setInt(1, randomNum);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);

            System.out.println(preparedStatement);
            preparedStatement.executeUpdate();
        }
        return "register";
    }
}
