package br.com.bookapi.devapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlerTest {
    @GetMapping(value = "/api/teste")
    public String teste() {
        return "esta configurado";
    }
}
