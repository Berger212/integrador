package com.example.xana.demo.controls;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PasswordControler {
    @GetMapping("/password")
    public String redfsenha(){
        return "password";
    }
}
