package com.kaar.springboot.restcruddemo.service;

import com.kaar.springboot.restcruddemo.dao.EmployeeDAO;
import com.kaar.springboot.restcruddemo.entity.Employee;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    // add field for EmployeeDAO
    private EmployeeDAO employeeDAO;

    // set up constructor


    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    public Employee findById(int theId) {
        return employeeDAO.findById(theId);
    }

    @Transactional
    @Override
    public Employee save(Employee theEMployee) {
        return employeeDAO.save(theEMployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeDAO.deleteById(theId);

    }
}
