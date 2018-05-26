package com.example.Spring_Example2.services;

import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by Sayali on 5/24/2018.
 */
@Component
public interface accountService {
    public Map<String,String> createAccount(String name);
}
