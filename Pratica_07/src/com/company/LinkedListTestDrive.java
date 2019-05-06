package com.company;

import java.util.LinkedList;

public class LinkedListTestDrive {
    public static void main(String[] args) {
        LinkedList<Item> list = new LinkedList<>();

        list.add(new Item(1,"XBOX ONE"));
        list.add(0,new Item(2,"Switch"));
        list.add(new Item(3,"PS4"));
        System.out.println("Tamanho: " + list.size());

        System.out.println("Itens da Lista: ");
        for (Item I : list
                ) {
            System.out.println("Item: " + I);

        }

    }
}
