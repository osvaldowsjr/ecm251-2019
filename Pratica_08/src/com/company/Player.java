package com.company;

public class Player extends Usuario {

    public Player(String nome, String email, String senha) {
        super(nome, email, senha);
    }

    @Override
    public boolean autentica(String senha) {
        if (senha.equals(this.senha)){
            System.out.println("Usuario autenticado");
            return senha.equals(this.senha);
        }
        System.out.println("Senha errada (Burro)");
        return false;
    }


}
