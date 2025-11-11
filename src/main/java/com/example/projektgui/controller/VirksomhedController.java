package com.example.projektgui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class VirksomhedController {

    /*Login til virksomhed*/
    @GetMapping("/virksomhed/login")
    public String virksomhedLogin() {
        return "virksomhed/virksomhedLogin";
    }


    @GetMapping("/virksomhed/virksomhed")
    public String visvirksomhedsForside() {
        return "virksomhed/virksomhed";
    }

    @GetMapping("/virksomhed/setilbud")
    public String setilbud() {
        return "virksomhed/setilbud";

    }

    @GetMapping("/virksomhed/rapport_madspild")
    public String rapport_madspild() {
        return "virksomhed/rapport_madspild";
    }

    @GetMapping("/virksomhed/lavtilbud")
    public String lavtilbud() {
        return "virksomhed/lavtilbud";
    }

    @GetMapping("/virksomhed/donermad")
    public String donermad() {
        return "virksomhed/donermad";
    }

}

