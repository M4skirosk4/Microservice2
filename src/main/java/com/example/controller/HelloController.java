/**
 * Esta clase es la que indica que se envía en la petición
 * Se añade este comentario para comprobar la configuración de los trigers
 */
package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/api/mensaje2")
    public String hello() {
        return "¡Hello Erik, I´m Microservice 2!";
    }
}
