package br.com.lucascode.blockbuster.blockbuster.controller;


import br.com.lucascode.blockbuster.blockbuster.model.DadosSerie;
import br.com.lucascode.blockbuster.blockbuster.service.api.OmdbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/consulta/{titulo}")
public class OmdbController {

    @Autowired
    private OmdbService omdbService;

    @GetMapping
    public ResponseEntity<DadosSerie> consultaOmdb(@PathVariable String titulo){

        DadosSerie payload = omdbService.buscarDados(titulo);
        return ResponseEntity.ok(payload);

    }


}
