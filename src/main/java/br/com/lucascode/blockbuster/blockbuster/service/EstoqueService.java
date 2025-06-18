package br.com.lucascode.blockbuster.blockbuster.service;

import br.com.lucascode.blockbuster.blockbuster.model.Estoque;
import br.com.lucascode.blockbuster.blockbuster.repository.EstoqueRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstoqueService {

    @Autowired
    private EstoqueRepository repository;


    public void saveEstoque(Estoque estoque){
        repository.save(estoque);
    }

    public List<Estoque> listarEstoque (){
        return repository.findAll();
    }

}
