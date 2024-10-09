package com.kaar.springboot.restcruddemo.dao;

import com.kaar.springboot.restcruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int theId);

    Employee save(Employee theEMployee);

    void deleteById(int theId);
}
