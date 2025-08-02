package com.example.employee.em_proj;
import java.util.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class EmployeeServiceImpl implements EmployeeService{
    
    @Autowired
    private EmployeeRepository employeeRepository;
    //List <Employee> employees = new ArrayList<>();
    @Override
    public String createEmployee(Employee employee) {
        EmployeeEntity employeeEntity = new EmployeeEntity();
        BeanUtils.copyProperties(employee, employeeEntity);
        employeeRepository.save(employeeEntity);
        //employees.add(employee);
        return "Creation success";
    }

    @Override
    public List<Employee> readEmployees() {
        List <EmployeeEntity>employeeList = employeeRepository.findAll();
        List <Employee> employees = new ArrayList<>();
        for(EmployeeEntity employeeEntity: employeeList){
            Employee emp = new Employee();
            emp.setId(employeeEntity.getId());
            emp.setName(employeeEntity.getName());
            emp.setPhone(employeeEntity.getPhone());
            emp.setEmail(employeeEntity.getEmail());
            employees.add(emp);
        }
        return employees;
        
    }

    @Override
    public boolean deleteEmployee(Long id) {
        if(employeeRepository.existsById(id)){
            employeeRepository.deleteById(id);
            return true;
        }
        return false;
    }

    @Override
    public String updateEmployee(Long id, Employee employee) {
        EmployeeEntity existingEmployee = employeeRepository.findById(id).get();
        existingEmployee.setEmail(employee.getEmail());
        existingEmployee.setName(employee.getName());
        existingEmployee.setPhone(employee.getPhone());
        employeeRepository.save(existingEmployee);
        return "Update Successfully";
    }

    @Override
    public Employee readEmployee(Long id) {
        EmployeeEntity employeeEntity = employeeRepository.findById(id).get();
        Employee employee = new Employee();
        BeanUtils.copyProperties(employeeEntity,employee);
        return employee;
    }

}
