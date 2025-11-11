package com.example.projektgui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BrugerController {

    // Login-side
    @GetMapping("/bruger/login")
    public String brugerLogin() {
        return "bruger/brugerLogin";
    }

    // Opret bruger (viser siden med oprettelsesformular)
    @GetMapping("/bruger/opret")
    public String opretBruger() {
        return "bruger/bruger";
    }

    // Brugerens hovedside
    @GetMapping("/bruger")
    public String visBrugerForside() {
        return "bruger/bruger";
    }

    // Opskrifter
    @GetMapping("/bruger/opskrifter")
    public String opskrifter() {
        return "bruger/opskrifter";
    }

    // Rapport
    @GetMapping("/bruger/rapport")
    public String rapport() {
        return "bruger/rapport";
    }

    // Tilføj vare
    @GetMapping("/bruger/tilfojvare")
    public String tilfojvare() {
        return "bruger/tilfojvare";
    }

    // Artikler
    @GetMapping("/artikler")
    public String artikler() {
        return "bruger/artikler";
    }
}


