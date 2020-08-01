package com.chen.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldMvcController {

    @RequestMapping("/helloworld")
    public String hello(Model model){
        model.addAttribute("mav","Hello,SpringBoot!我是MVC结构");
        // 视图的位置和名称。视图位于example文件包下面，名称叫hello.html
        return "example/hello";
    }
}
