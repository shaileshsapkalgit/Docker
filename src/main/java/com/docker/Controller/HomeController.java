package com.docker.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class HomeController {

    @GetMapping("/home")
    public String home() {
        return "index";
    }

}
