package spring.security.oauth2.keycloak.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author Sattya
 * create at 9/21/2024 5:28 AM
 */
@Controller
public class HomeController {
    @GetMapping("/home")
    public String home() {
        return "home";
    }
}
