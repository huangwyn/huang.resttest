package com.quintrix.huangresttest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
public class EmployeeController {

    @GetMapping("/home")
    public List<Employee> getEmployees(){
        //list of employees
        return Arrays.asList(new Employee("billly", 5), new Employee("one", 2));

    }

    @PostMapping("/employee")
    public Employee postEmployee(@RequestBody Employee employee){
        Employee one = new Employee();
        one.setName(employee.getName());
        one.setIdNumber(employee.getIdNumber());
        return one;
    }

    @GetMapping("/home/{id}")
    public Employee getEmployeeById(@PathVariable int id){
        return new Employee("guy", id);
    }

}
