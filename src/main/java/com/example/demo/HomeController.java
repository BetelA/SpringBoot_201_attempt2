package com.example.demo;

import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/loadform")
    public String loadFormPage(){
        return "formtemplate";
    }
    @RequestMapping("/processform")
    public String loadFormPage(@RequestParam("login")String login, Model model){
        model.addAttribute("loginval",login);
        return "confirm";
    }
        return "formtemplate";
}
