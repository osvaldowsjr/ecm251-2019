package com.membros.comunidade;

public class Membro {
    protected String nome;
    protected String cpf;


    public Membro (String nome,String cpf){
        this.nome =nome;
        this.cpf = cpf;
    }

    public String getDados (){
        return "Nome: " + this.nome + "\n" + "CPF: " + this.cpf;
    }


}
