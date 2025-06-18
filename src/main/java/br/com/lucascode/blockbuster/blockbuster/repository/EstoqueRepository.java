package br.com.lucascode.blockbuster.blockbuster.repository;

import br.com.lucascode.blockbuster.blockbuster.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface EstoqueRepository extends JpaRepository<Estoque, Long> {

}
