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

    @RequestMapping("/api/test2")
    public ResponseEntity getTest2() {
        return new ResponseEntity("Test2", HttpStatus.OK);
    }

    @RequestMapping("/api/test3")
    public ResponseEntity getTest3() {
        return new ResponseEntity("Test3", HttpStatus.OK);
    }

    @RequestMapping("/api/test4")
    public ResponseEntity getTest4() {
        return new ResponseEntity("Test4", HttpStatus.OK);
    }

    @RequestMapping("/api/test5")
    public ResponseEntity getTest5() {
        return new ResponseEntity("Test5", HttpStatus.OK);
    }

    @RequestMapping("/api/test6")
    public ResponseEntity getTest6() {
        return new ResponseEntity("Test6", HttpStatus.OK);
    }
}
