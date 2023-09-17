package com.spring.seminar4.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class TestController {
    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
