package com.example.Spring_Example3.servicce;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Sayali on 5/26/2018.
 */

@Component
public class employeeService {

    List<Employee> list=new ArrayList<>();

    public Employee getEmployee()
    {
        Employee e=new Employee();
        e.setFirstName("Sushant");
        e.setLastName("Mandhare");
        e.setEmp_id(100);
        e.setSalary(2000.00f);
        return e;
    }
    public List<Employee> getList()
    {
        return list;
    }
    public String add(Employee e)
    {
        if(list.add(e))
            return "added successfully";
        else
            return "adding fails";
    }
}
