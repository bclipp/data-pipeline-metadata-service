package com.example.datapipelinemetadata.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthController {

    @GetMapping("/health")
    public String sayHello() {
        return "OK";
    }

    // expose new endpoint for "workout"
    @GetMapping("/version")
    public String workout() {
        return "Get after it!";
    }

}
