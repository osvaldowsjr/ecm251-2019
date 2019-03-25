package com.company;

public class Compra {
    private int id;
    private Cliente cliente;
    private Produto produto;

    public Compra (int id, Cliente cliente, Produto produto){
        this.cliente = cliente;
        this.produto = produto;
        this.id = id;
    }

    public void PegarInfo(){
        System.out.println("Cliente: " + cliente.getNome() + "\n" + "Produto: " + produto.getNome() + "\n" + "Id: " + getId()+ "\n");
    }


    public int getId() {
        return id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public Produto getProduto() {
        return produto;
    }

}
