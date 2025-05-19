package org.example.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class IndexController {

    @Value("$server.password")
    private String serverPassword;

    @GetMapping("/")
    public Map helloWorld(){
        return new HashMap<>(){{
            put("hello", "world");
            put("password", serverPassword);
        }};

    }
}
