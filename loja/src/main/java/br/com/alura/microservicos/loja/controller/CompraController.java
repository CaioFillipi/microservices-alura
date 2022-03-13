package br.com.alura.microservicos.loja.controller;

import br.com.alura.microservicos.loja.DTO.CompraDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/v1/compra")
public class CompraController {

    @PostMapping
    public void realizarCompra(@RequestBody CompraDTO compra){

    }
}
