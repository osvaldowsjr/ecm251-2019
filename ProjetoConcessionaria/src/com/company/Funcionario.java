package com.company;

public class Funcionario {
    private double comissao;
    private double salarioBase;
    private double salarioMes;
    private String nome;
    private String Cpf;
    private double porcentagemComissao;


    public double GetSalarioMes(double totalVendas){
        salarioMes = totalVendas* porcentagemComissao + this.getSalarioBase();
        return getSalarioMes();
    }

    public double comissao(double vendas){
        comissao = porcentagemComissao*vendas;
        return comissao;
    }

    public Funcionario(double salarioBase, String nome, String Cpf){
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.Cpf = Cpf;
        this.porcentagemComissao = 0.05;
    }

    public String GetDados(double vendas){
        double comissao = comissao(vendas);
        double SalarioMes = GetSalarioMes(vendas);
        return "Nome: " + this.getNome() + "\n" + "Salário do base: " + this.getSalarioBase() + "\n" + "Salário do mês: " + this.getSalarioMes() + "\n"+ "Porcentagem de comissão: "+ getPorcentagemComissao() *100+"%"+ "\n" + "Comissão: " + comissao ;
    }

    public double getComissao(double vendas) {
        return comissao(vendas);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getSalarioMes() {
        return salarioMes;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return Cpf;
    }

    public double getPorcentagemComissao() {
        return porcentagemComissao*100;
    }
}
