package com.company;

public class Funcionario {
    private double comissao;
    private double salarioBase;
    private double salarioMes;
    private String nome;
    private String Cpf;


    public double GetSalarioMes(double totalVendas){
        salarioMes = totalVendas*0.05 + this.salarioBase;
        return salarioMes;
    }

    public double comissao(double vendas){
        comissao = 0.05*vendas;
        return comissao;
    }

    public Funcionario(double salarioBase, String nome, String Cpf){
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.Cpf = Cpf;
    }

    public String GetDados(double vendas){
        double comissao = comissao(vendas);
        double SalarioMes = GetSalarioMes(vendas);
        return "Nome: " + this.nome + "\n" + "Salário do base: " + this.salarioBase + "\n" + "Salário do mês: " + salarioMes + "\n" + "Comissão: " + comissao;
    }

}
