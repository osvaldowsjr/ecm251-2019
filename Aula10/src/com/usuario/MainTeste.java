package com.usuario;

public class MainTeste {
    public static void main(String[] args) {
        User u1 = new User("Rafa","Rafa123");
        System.out.println(u1);
        Pentelho p1 = new Pentelho();
        p1.Pentelhar(u1);
    }
}
