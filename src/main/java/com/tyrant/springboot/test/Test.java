package com.tyrant.springboot.test;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {

    @RequestMapping(value = {"", "/index"})
    public String index(Model model) {
        model.addAttribute("msg", "Hello Springboot");
        return "index";
    }

}
