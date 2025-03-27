package pe.edu.vallegrande.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class helloController {

    @GetMapping
    public String saludo() {
        return "Hello World Yes! Team Blue";
    }

}
