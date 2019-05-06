package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDrive {

    public static void main(String[] args) {
        List<Item> lista = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Informe Id e nome: ");
            int id = scanner.nextInt();
            String nome = scanner.next();
            lista.add(new Item(id,nome));
            System.out.println("Continuar?");
            if (scanner.nextInt() == 0){
                break;
            }
        }
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Itens da Lista: ");
        for (Item I : lista
                ) {
            System.out.println("Item: " + I);

        }
    }
}
