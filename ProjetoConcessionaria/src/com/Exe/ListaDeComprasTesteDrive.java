package com.Exe;

import java.util.Scanner;

public class ListaDeComprasTesteDrive {
    public static void main(String[] args) {
        ListaDeCompras listaDeCompras = new ListaDeCompras();
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i =0;i<3;i++){
//            System.out.println("Digite o nome do produto: ");
//            String nome = scanner.next();
//            if (listaDeCompras.AdicionarProduto(new Produto(nome))){
//                System.out.println("Produto Add");
//            }else System.out.println("ERROU");
//        }


        listaDeCompras.AdicionarProduto(new Produto("A"));
        listaDeCompras.AdicionarProduto(new Produto("B"));
        if (listaDeCompras.RemoverProduto("A"))
            System.out.println("Removido");
        if (listaDeCompras.RemoverProduto("c"))
            System.out.println("Removido");
        else System.out.println("Deu merda");
    }
}