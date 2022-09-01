package com.quintrix.huangresttest.service;

import com.quintrix.huangresttest.dao.EmployeeDao;
import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    public Employee postEmployee(Employee employee) {
        return employeeDao.postEmployee(employee);
    }

    @Override
    public void deleteEmployee(String name, int id) {
        employeeDao.deleteEmployee(name, id);
    }

    @Override
    public void putEmployee(Employee employee) {
        employeeDao.putEmployee(employee);
    }
}
