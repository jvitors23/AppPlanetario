package com.example.appplanetario;

import java.io.Serializable;

public class Entidade implements Serializable {
    public int id;
    public String nome;

    public Entidade(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    public void setId(int id){
        this.id = id;

    }

    public void setNome(String nome){
        this.nome = nome ;

    }

    public int getId(){
        return this.id;
    }

    public String getNome(){
        return this.nome;
    }
}