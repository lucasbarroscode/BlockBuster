package br.com.lucascode.blockbuster.blockbuster.repository;

import br.com.lucascode.blockbuster.blockbuster.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository <Filme, Long> {
}


