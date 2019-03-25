package com.company;

public class Main {

    public static void main(String[] args) {
        Cliente cliente = new Cliente("Scalco");
        Produto produto = new Produto(5.50,2222,"Salgado");

        Compra c1 = new Compra(1,cliente,produto);

        c1.PegarInfo();

    }
}
