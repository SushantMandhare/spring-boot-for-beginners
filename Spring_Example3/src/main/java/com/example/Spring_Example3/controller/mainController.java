package com.example.Spring_Example3.controller;

import com.example.Spring_Example3.servicce.Employee;
import com.example.Spring_Example3.servicce.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by Sayali on 5/26/2018.
 */

@RestController
public class mainController {

    @Autowired
    employeeService empService;

    @GetMapping("/employee")
    public Employee getEmployee()
    {
        return empService.getEmployee();
    }

    @GetMapping("/getall")
    public List<Employee> getAllEmployee()
    {
        return empService.getList();
    }

    @PostMapping("/save")
    public String save(@RequestBody Employee e)
    {
        return empService.add(e);
    }

}
