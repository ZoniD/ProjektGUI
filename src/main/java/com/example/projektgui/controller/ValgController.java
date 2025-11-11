package com.example.projektgui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ValgController {

    @GetMapping("/forside/index")
    public String visindex(){
        return "forside/index";
    }
    @GetMapping("/forside/valg")
    public String visValg(){
        return "forside/valg";
    }

    @GetMapping("/logaf")
    public String logaf(){
        return "forside/index";
    }
}
