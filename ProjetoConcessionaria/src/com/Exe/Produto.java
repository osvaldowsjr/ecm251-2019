package com.Exe;

public class Produto {
    private String nome;
    private String preco;
    public Produto (String nome){
        this.nome = nome;
    }


    @Override
    public String toString(){
        return nome;
    }
    @Override
    public boolean equals(Object obj){
        return this.nome.equals(obj.toString());
    }
}
