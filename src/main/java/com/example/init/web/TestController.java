package com.example.init.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
    @GetMapping("/test")
//    name='~~~'& age='~~~~'
    public String wel(String name ,int age, Model model) {
        System.out.println(name+" "+age);
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "test";
    }
}
