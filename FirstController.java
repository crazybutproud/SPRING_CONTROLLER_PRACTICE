package com.example.lessonmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/frist")
public class FirstController {
    @GetMapping("/hello")
    public String helloPage() {
        return "static/hello";
    }

    @GetMapping("/bye")
    public String byePage() {
        return "static/bye";
    }
}
