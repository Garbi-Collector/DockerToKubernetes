package com.montecristo.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HolaController {

    @GetMapping("/hola")
    public String hola() {
        return "Hola desde Docker!";
    }

    @GetMapping("/estado")
    public String estado() {
        return "Aplicacion funcionando";
    }
}