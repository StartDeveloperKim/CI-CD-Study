package com.study.cicd;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("test")
public class HomeController {

    @GetMapping("/{page}")
    public String test(@PathVariable(value = "page", required = false) Integer page, Model model) {
        model.addAttribute("page", page);
        return "index";
    }
}
