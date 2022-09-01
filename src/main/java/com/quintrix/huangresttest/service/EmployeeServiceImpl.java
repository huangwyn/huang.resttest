package com.quintrix.huangresttest.service;

import com.quintrix.huangresttest.dao.EmployeeDao;
import com.quintrix.huangresttest.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;

    @Override
    public List<Employee> getEmployees() {
        return employeeDao.getEmployees();
    }

    @Override
    public Employee postEmployee() {
        return employeeDao.postEmployee();
    }

    @Override
    public void deleteEmployee() {
        employeeDao.deleteEmployee();
    }

    @Override
    public void putEmployee(Employee employee) {
        employeeDao.putEmployee(employee);
    }
}
