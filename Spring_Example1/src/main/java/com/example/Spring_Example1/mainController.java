package com.example.Spring_Example1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Sayali on 5/24/2018.
 */

@RestController
public class mainController {


    @RequestMapping("/name")
    public String getname()
    {
        return "Welcome Sushant";
    }
}
