package com.example.init.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    private List<User> userList =new ArrayList<>();

    @PostMapping("/create")
    public String register(User user)
    {
        userList.add(user);
        return "redirect:/list";
    }

    @GetMapping("/list")
    public String list(Model model)
    {
        model.addAttribute("user", userList);
        return "userList";
    }
}
