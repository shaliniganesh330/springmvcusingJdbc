package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller

public class LoginController {
    @RequestMapping(value = "/")
    public String indexPage() {
        return "index";
    }

    @RequestMapping("/WelcomePage")
    public String login(@RequestParam("username") String user, @RequestParam("password") String password, ModelMap map) {
        Login login1 = new Login(user,password);
        //login1.setUsername(user);
        //login1.setPassword(password);
        map.addAttribute("message", login1.getUsername());
        return "welcomepage";
    }
}


