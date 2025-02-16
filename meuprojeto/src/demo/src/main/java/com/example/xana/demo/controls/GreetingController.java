package com.example.xana.demo.controls;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
		model.addAttribute("name", name);
		return "greeting";
	}
    
    @GetMapping(value = {"/login"})
    public String login(){
        return "login";
    }

	@GetMapping("/cadastro")
	public String cadastro(){
		return "cadastro";
	}
	@GetMapping("/cadreceita")
	public String inicial(){
		return "cadreceita";
	}
	@GetMapping("/listreceita")
	public String lista(){
		return "listreceitas";
	}
}