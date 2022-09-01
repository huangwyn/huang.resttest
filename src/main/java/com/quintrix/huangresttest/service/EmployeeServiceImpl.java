package com.quintrix.huangresttest.service;

import com.quintrix.huangresttest.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    EmployeeDao employeeDao;
}
