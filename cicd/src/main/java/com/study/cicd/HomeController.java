package com.study.cicd;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping("test")
public class HomeController {

    @GetMapping("/{page}")
    public String test(@PathVariable(value = "page", required = false) Integer page, Model model) {
        model.addAttribute("page", page);
        if (page % 2 == 1) {
            log.info("현재 페이지는 {} 입니다.", page);
        }else{
            log.error("현재 페이지는 오류 페이지 입니다. {}", page);
        } 
        // Travis-CI 연동하기
        return "index";
    }
}
