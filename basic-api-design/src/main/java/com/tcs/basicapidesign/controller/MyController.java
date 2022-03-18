package com.tcs.basicapidesign.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    
    @GetMapping("/test-api")
    public String getAPI() {
        return "Manikanta";
    }
}
