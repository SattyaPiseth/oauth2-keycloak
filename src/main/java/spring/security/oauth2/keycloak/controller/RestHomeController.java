package spring.security.oauth2.keycloak.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * @author Sattya
 * create at 9/21/2024 2:33 PM
 */
@RestController
@RequestMapping("/api/home")
@CrossOrigin(origins = "*")
public class RestHomeController {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public String home(){
        return  "Hello";
    }
}
