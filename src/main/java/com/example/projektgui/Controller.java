package com.example.projektgui;

@Controller

public class Controller {
    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // henviser til login.html i templates-mappen
    }

    @PostMapping("/login")
    public String processLogin() {
        return "organisation"; // går videre til organisation.html
    }

}
