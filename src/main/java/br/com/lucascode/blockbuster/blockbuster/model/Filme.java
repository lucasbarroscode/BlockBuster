package br.com.lucascode.blockbuster.blockbuster.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private String genero;
    private Long duracao;

    public Filme(Long id, String titulo, String genero, Long duracao) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.duracao = duracao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Long getDuracao() {
        return duracao;
    }

    public void setDuracao(Long duracao) {
        this.duracao = duracao;
    }
}
