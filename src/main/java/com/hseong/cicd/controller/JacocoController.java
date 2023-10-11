package com.hseong.cicd.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class JacocoController {

    @GetMapping("/jacoco")
    public ResponseEntity<String> jacoco() {
        return ResponseEntity.ok("Hello, Jacoco!");
    }

    @GetMapping("/code-coverage")
    public ResponseEntity<String> coveCoverage() {
        return ResponseEntity.ok("Get code coverage!");
    }
}
