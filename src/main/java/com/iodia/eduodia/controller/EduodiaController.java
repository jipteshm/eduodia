package com.iodia.eduodia.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EduodiaController
{
    @RequestMapping("/hello")
    public String hello()
    {
        return "Welcome to Eduodia!";
    }

}
