package com.chen.study.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldControlloer {

    @RequestMapping("/hello")
    public String hello(){

        String jtr = "{\"member\": [\n" +
                "  {\"name\": \"che\"}\n" +
                "]}";
        return "Hello,SpringBoot!";
    }
}
