package com.lnh.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by LiNanHao on 2018/11/2.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello()
    {
        return "Hello World!";
    }

    @RequestMapping("/test2")
    public String test2() {
        return "test2";
    }
    @RequestMapping("/test")
    public String test()
    {
        return "test";
    }

    @RequestMapping("/sayHello1")
    public String sayHello1()
    {
        return "Hello World 1 !";
    }

    @RequestMapping("/branch1")
    public String branch1()
    {
        return "branch1";
    }
}
