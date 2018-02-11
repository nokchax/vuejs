package com.retrokarr.vuejs.vuejsstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;


@Controller
@RequestMapping({"/{no}", ""})
public class HomeController {
    @GetMapping
    public String home(@PathVariable(required = false) String no) {
        return Optional.ofNullable(no)
                .map(n -> "vue" + n)
                .orElse("index");
    }
}
