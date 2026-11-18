package com.seduc2.gta.Entities;

import com.seduc2.gta.Entities.Dificuldade;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Missao {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String local;
    private Dificuldade dificuldade;
    private String imagem;
    private String descricao;


    public Missao(){}


    public Missao(String nome, String local, Dificuldade dificuldade, String imagem, String descricao) {
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
        this.imagem = imagem;
        this.descricao = descricao;
    }


    public Missao(Long id, String nome, String local, Dificuldade dificuldade, String imagem, String descricao) {
        this.id = id;
        this.nome = nome;
        this.local = local;
        this.dificuldade = dificuldade;
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


    public String getLocal() {
        return local;
    }


    public void setLocal(String local) {
        this.local = local;
    }


    public Dificuldade getDificuldade() {
        return dificuldade;
    }


    public void setDificuldade(Dificuldade dificuldade) {
        this.dificuldade = dificuldade;
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