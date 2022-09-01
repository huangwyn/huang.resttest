package com.quintrix.huangresttest.controller;

import com.quintrix.huangresttest.model.Employee;
import com.quintrix.huangresttest.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @RequestMapping(method = RequestMethod.GET, value = "/home")
    public List<Employee> getEmployees(){
        //list of employees
        return employeeService.getEmployees();

    }

    @RequestMapping(method = RequestMethod.POST, value = "/employee")
    public Employee postEmployee(@RequestBody Employee employee){
        return employeeService.postEmployee(employee);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/erase/{id}")
    public void deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/place")
    public void putEmployee(@RequestBody Employee employee){
        employeeService.putEmployee(employee);
    }

}
