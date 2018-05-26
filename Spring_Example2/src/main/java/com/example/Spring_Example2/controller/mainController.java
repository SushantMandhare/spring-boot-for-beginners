package com.example.Spring_Example2.controller;

import com.example.Spring_Example2.services.accountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

/**
 * Created by Sayali on 5/24/2018.
 */
@RestController
public class mainController {

    @Autowired
    accountService acc;

    @PostMapping("/create")
    public Map<String,String> createAccount(@RequestParam("name") String name)
    {
        return acc.createAccount(name);
    }
    @RequestMapping("*")
    public String defaultMethod()
    {
        return "Default";
    }
}
