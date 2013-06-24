package com.eighlark.codex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping(value = "/")
    public String index(ModelMap map) {
        return "index";
    }
}
