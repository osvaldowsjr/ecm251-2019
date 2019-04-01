package com.company;

public class Conta {
    private int numeroConta;
    private double saldo;
    private String nome;

    private static int totalDeContas = 0;

    public static int getTotalDeContas(){
        return totalDeContas;
    }

    public String pegaDados(){
        return "Saldo: "+this.saldo + " Número da conta: " + this.numeroConta+ " Nome: " + this.nome;

    }

    public Conta(String nome,double saldo){
        this.nome = nome;
        this.saldo = saldo;
        this.numeroConta = Conta.totalDeContas;
        Conta.totalDeContas++;

    }
}
