package com.tejinder.photographyBackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class basicController {
    @RequestMapping("/")

    public String go()
    {
        return "contact";
    }

    @RequestMapping("/photography")

    public String go2()
    {
        return "index";
    }
}
