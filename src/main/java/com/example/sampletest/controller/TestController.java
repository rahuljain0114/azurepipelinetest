package com.example.sampletest.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/api/status")
    public ResponseEntity getHealth() {
        return new ResponseEntity("Alive", HttpStatus.OK);
    }

    @RequestMapping("/api/test1")
    public ResponseEntity getTest1() {
        return new ResponseEntity("Test1", HttpStatus.OK);
    }
}
