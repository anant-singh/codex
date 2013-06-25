package com.eighlark.codex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created at Eighlark
 * User: Akshay
 * Date: 6/23/13
 * Time: 12:24 PM
 * Email: akshay@eighlark.com
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String showHomePage() {
        return "home";
    }
}
