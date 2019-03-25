package com.company;

public class Compra {
    private long id;
    private Cliente cliente;
    private Produto produto;

    public Compra (long id, Cliente cliente, Produto produto){}

    public void PegarInfo(){
        System.out.println("Cliente: " + getCliente() + "\n" + "Produto: " + getProduto() + "\n" + "Id" + getId()+ "\n");
    }


    public long getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Produto getProduto() {
        return produto;
    }

}
