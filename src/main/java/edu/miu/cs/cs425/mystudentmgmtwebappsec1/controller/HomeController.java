package edu.miu.cs.cs425.mystudentmgmtwebappsec1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = {"/","/home","/e-registrar/home"})
    public String displayHomepage(){
        return "public/index";
    }

    @GetMapping(value = {"/e-registrar/about"})
    public String displayAboutpage(){
        return "public/about";
    }


}
