package com.example.employee.em_proj;

import org.springframework.web.bind.annotation.RestController;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmpController {
    
    //List<Employee> employees =  new ArrayList<>();
    // EmployeeService employeeService=new EmployeeServiceImpl();
    @Autowired
    EmployeeService employeeService;

    
    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployee();
    }

    @PostMapping("employees")
    public String createEmployee(@RequestBody Employee employee){
        employeeService.createEmployee(employee);
        return "Saved";
    }

    @DeleteMapping("employees/{id}")
    public String deleteEmployee(@PathVariable Long id){
        if(employeeService.deleteEmployee(id))
            return "Deleted";
        return "Not found";
    }
    
}
