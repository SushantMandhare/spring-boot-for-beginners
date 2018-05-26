package com.example.Spring_Example2.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;
import sun.util.PreHashedMap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Sayali on 5/24/2018.
 */
@Component
@Profile("prod")
public class accountProd implements accountService{
    @Override
    public Map<String, String> createAccount(String name) {
        Map<String,String> mp=new HashMap<>();
        mp.put("STATUS","Created account on prod");
        return mp;
    }
}
