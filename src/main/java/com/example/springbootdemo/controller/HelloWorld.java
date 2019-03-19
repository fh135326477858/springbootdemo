package com.example.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping("/index")
    public String hello(ModelAndView model){
        model.addObject("hello world");
        return "Hello World!";
    }

    @RequestMapping("/thymeleaf")
    public String hello2(Map<String,Object> map){
        map.put("test","test");
        map.put("user",Arrays.asList("111", "222"));
        return "ok";
    }

    @RequestMapping("/thymeleaf2")
    public String hello3(){
        return "ok";
    }

}
