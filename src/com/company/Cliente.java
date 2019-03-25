package com.company;

public class Cliente {
    private String nome;
    private String RA;
    private String Funcionario;
    private String Visitante;

    public Cliente (String nome){}

    public static void Comprar(){

    }
    public static void Acompanhar(){

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRA() {
        return RA;
    }
    public void setRA(String RA) {
        this.RA = RA;
    }
    public String getFuncionario() {
        return Funcionario;
    }
    public void setFuncionario(String funcionario) {
        Funcionario = funcionario;
    }
    public String getVisitante() {
        return Visitante;
    }
    public void setVisitante(String visitante) {
        Visitante = visitante;
    }
}
