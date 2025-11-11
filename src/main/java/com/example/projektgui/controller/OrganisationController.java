package com.example.projektgui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrganisationController {

    // Login-side
    @GetMapping("/organisation/organisationLogIn")
    public String organisationLogin() {
        return "organisation/organisationLogIn";
    }

    // Forside for organisation
    @GetMapping("/organisation/organisation")
    public String organisationForside() {
        return "organisation/organisation";
    }

    // Kampagner
    @GetMapping("/organisation/kampagner")
    public String kampagner() {
        return "organisation/kampagner";
    }

    // Donér og registrér
    @GetMapping("/organisation/donerOgRegistrer")
    public String donerOgRegistrer() {
        return "organisation/donerOgRegistrer";
    }
}
