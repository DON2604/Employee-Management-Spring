package com.example.employee.em_proj;

import java.util.*;

public interface EmployeeService {
    String createEmployee(Employee employee);
    List<Employee> readEmployee();
    boolean deleteEmployee(Long id);

}
