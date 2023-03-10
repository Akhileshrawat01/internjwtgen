package dev.akhil.jwtdemo1.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class HomeController {

	@GetMapping("/login")
    public String home(Principal principal) {
        return "Hello, " + principal.getName();
    }

}