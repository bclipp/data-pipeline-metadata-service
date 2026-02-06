package com.example.datapipelinemetadata.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class HealthController {
    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    @Value("${app.environment}")
    private String appEnvironment;

    @GetMapping("/health")
    public String health() {
        return "ok!";
    }

    @GetMapping("/version")
    public String version() {
        return appName + " " + appVersion + " (" + appEnvironment + ")";
    }

    // expose new endpoint for "workout"
    @GetMapping("/version")
    public String workout() {
        return "Get after it!";
    }

}
