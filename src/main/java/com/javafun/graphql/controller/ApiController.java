package com.javafun.graphql.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
    @PostMapping("/doSomeCalculation")
    public Map<String, String> doSomeCalculation() {
        Map<String, String> res = new HashMap<>();
        res.put("status", "success");
        return res;
    }
}
