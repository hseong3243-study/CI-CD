package com.hseong.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return ResponseEntity.ok("Hello, world!");
    }

    @GetMapping("/sonar-cloud")
    public ResponseEntity<String> sonarCloud() {
        return ResponseEntity.ok("Hello, sonarCloud!");
    }
}
