package br.com.lucascode.blockbuster.blockbuster.controller;

import br.com.lucascode.blockbuster.blockbuster.model.Estoque;
import br.com.lucascode.blockbuster.blockbuster.service.EstoqueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estoque")
public class EstoqueController {

    @Autowired
    private EstoqueService estoqueService;

    @PostMapping
    public ResponseEntity<Estoque> salvar(@RequestBody Estoque estoque){
        estoqueService.saveEstoque(estoque);
        return ResponseEntity.status(HttpStatus.CREATED).body(estoque);
    }

    @GetMapping
    public List<Estoque> buscarTodos(){
        return estoqueService.listarEstoque();
    }





}
