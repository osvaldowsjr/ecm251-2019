package com.company;

public class Produto {
    private double preco;
    private long id;
    private String nome;


    public Produto(double preco, long id, String nome){
        this.preco = preco;
        this.id = id;
        this.nome = nome;
    }

    public void PegarInfo(){
        System.out.println("Nome: " + getNome() + "\n" + "Preço: " + getPreco() + "\n" + "Id" + getId()+ "\n");
    }

    public double getPreco() {
        return preco;
    }
    public long getId() {
        return id;
    }
    public String getNome() {
        return nome;
    }

}
