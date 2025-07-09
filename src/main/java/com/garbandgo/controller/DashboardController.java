package com.garbandgo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String dashboard(Model model, OAuth2AuthenticationToken token) {
        String name = token.getPrincipal().getAttribute("name");
        model.addAttribute("name", name);
        return "dashboard"; // This will look for dashboard.html in src/main/resources/templates
    }
}
