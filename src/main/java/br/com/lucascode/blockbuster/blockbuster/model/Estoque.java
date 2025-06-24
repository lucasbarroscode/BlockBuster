package br.com.lucascode.blockbuster.blockbuster.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

import java.util.UUID;

@Entity
public class Estoque {

    @Id
    private Long uuid;
    @ManyToOne
    private Filme filme;
    private Long quantidade;

    public Estoque(Long uuid, Filme filme, Long quantidade) {
        this.uuid = uuid;
        this.filme = filme;
        this.quantidade = quantidade;
    }

    public Long getUuid() {
        return uuid;
    }

    public void setUuid(Long uuid) {
        this.uuid = uuid;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public Long getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Long quantidade) {
        this.quantidade = quantidade;
    }
}
