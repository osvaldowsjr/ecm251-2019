package com.company;

public class Main {

    public static void main(String[] args) {
        SistemaLogin sistemaLogin = new SistemaLogin();
        sistemaLogin.Monitorar();


        Player p1 = new Player("Carlos","carlos123","123");

        p1.autentica("12345");

    }
}
