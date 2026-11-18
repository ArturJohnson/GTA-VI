package com.seduc2.gta.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Arma {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private CategoriaArma categoriaArma;
    private String fabricante;
    private String imagem;
    private String descricao;

    public Arma() {}

    public Arma(String nome, CategoriaArma categoria, String fabricante, String imagem, String descricao) {
        this.nome = nome;
        this.categoriaArma = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Arma(Long id, String nome, CategoriaArma categoria, String fabricante, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.categoriaArma = categoria;
        this.fabricante = fabricante;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public CategoriaArma getCategoria() {
        return categoriaArma;
    }

    public void setCategoria(CategoriaArma categoria) {
        this.categoriaArma = categoria;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}