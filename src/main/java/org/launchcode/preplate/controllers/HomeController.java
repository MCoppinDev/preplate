package org.launchcode.preplate.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("")
    public String index(Model model) {
        model.addAttribute("title", "Pre-Plated");
        return "index";
    }
}
