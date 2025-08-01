package com.example.employee.em_proj;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmpController {
    
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        List<Employee> employees =  new ArrayList<>();
        return employees;
    }
    
}
