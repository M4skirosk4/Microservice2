package com.ejemplo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/mensaje2")
    public String hello() {
        return "¡Hola desde Microservicio 2!";
    }
}
