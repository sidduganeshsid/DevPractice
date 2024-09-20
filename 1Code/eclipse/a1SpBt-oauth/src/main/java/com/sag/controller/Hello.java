package com.sag.controller;


import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Hello {

    @GetMapping("/hello")
    public String hello(@AuthenticationPrincipal OAuth2User principal, Model model) {
        String name = principal.getAttribute("name");
        model.addAttribute("name", name);
        return "hello";
    }
}
