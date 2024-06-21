package com.TwineEngine.lustwave.controller;

import com.TwineEngine.lustwave.service.ContentService;
import com.TwineEngine.lustwave.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class MainController {

    @Autowired
    private ContentService contentService;

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String index(Model model, Principal principal) {
        model.addAttribute("contents", contentService.findAll());
        if (principal != null) {
            model.addAttribute("user", userService.findByUsername(principal.getName()));
        }
        return "index";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/register")
    public String register() {
        return "register";
    }

    @GetMapping("/profile")
    public String profile(Model model, Principal principal) {
        if (principal != null) {
            model.addAttribute("user", userService.findByUsername(principal.getName()));
        }
        return "profile";
    }
}
