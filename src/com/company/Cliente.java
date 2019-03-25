package com.company;

import java.util.Random;

public class Cliente {
    private String nome;
    private String RA;
    private boolean Visitante;
    private boolean Funcionario;

    public Cliente (String nome){
        this.nome = nome;
        this.Visitante = true;
    } //Visitante
    public Cliente (String nome, boolean funcionario){
        this.nome = nome;
        if (funcionario)
            this.Funcionario = true;
        else
            this.Visitante = true;
    }// Visitante e funcionario
    public Cliente (String nome,String ra){
        this.nome = nome;
        this.RA = ra;
    } //Aluno

    public static void Comprar(){

    }
    public static void Acompanhar(){

    }
    public String getNome() {
        return nome;
    }
    public String getRA() {
        return RA;
    }
    public boolean isVisitante() {
        return Visitante;
    }
    public boolean isFuncionario() {
        return Funcionario;
    }
}
