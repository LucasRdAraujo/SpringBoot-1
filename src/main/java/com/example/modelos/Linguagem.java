/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Lucas Araujo
 */
@Entity
public class Linguagem {

    @Id
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false)
    private String avaliacao;

    public Linguagem(int id, String nome, String avaliacao) {
        this.id = id;
        this.nome = nome;
        this.avaliacao = avaliacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avaliacao = avaliacao;
    }

}
