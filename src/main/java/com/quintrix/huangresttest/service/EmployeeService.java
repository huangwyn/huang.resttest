package com.quintrix.huangresttest.service;

import com.quintrix.huangresttest.model.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> getEmployees();
    public Employee postEmployee(Employee employee);
    public void deleteEmployee(int id);
    public void putEmployee(Employee employee);
}
