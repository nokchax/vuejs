package com.retrokarr.vuejs.vuejsstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/{no}")
public class HomeController {
    @GetMapping
    public String home(@PathVariable String no) {
        return "vue" + no;
    }
}
