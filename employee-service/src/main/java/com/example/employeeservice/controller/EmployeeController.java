package com.example.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//EmployeeController.java
@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @GetMapping("/message")
    public String employeeMessage() {
        return "Hello from employee-service";
    }
}