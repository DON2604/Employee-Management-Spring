package com.example.employee.em_proj;
import java.util.*;

import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService{
    

    List <Employee> employees = new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        employees.add(employee);
        return "Creation success";
    }

    @Override
    public List<Employee> readEmployee() {
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        employees.remove(id);
        return true;
    }

}
