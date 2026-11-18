package com.seduc2.gta.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String marca;
    private CategoriaVeiculo categoriaVeiculo;
    private String imagem;
    private String descricao;

    public Veiculo() {}

    public Veiculo(String nome, String marca, CategoriaVeiculo categoria, String imagem, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.categoriaVeiculo = categoria;
        this.imagem = imagem;
        this.descricao = descricao;
    }

    public Veiculo(Long id, String nome, String marca, CategoriaVeiculo categoria, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.marca = marca;
        this.categoriaVeiculo = categoria;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public CategoriaVeiculo getCategoria() {
        return categoriaVeiculo;
    }

    public void setCategoria(CategoriaVeiculo categoria) {
        this.categoriaVeiculo = categoria;
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