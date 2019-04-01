package com.company;

public class Gerente {
    private double comissao;
    private double salarioBase;
    private double salarioMes;
    private String nome;
    private String Cpf;
    private double porcentagemComissao;


    public double GetSalarioMes(double totalVendas){
        salarioMes = totalVendas* getPorcentagemComissao() + this.getSalarioBase();
        return getSalarioMes();
    }

    public double comissao(double vendas){
        comissao = porcentagemComissao*vendas+0.5*this.salarioBase;
        return comissao;
    }

    public Gerente(double salarioBase, String nome, String Cpf){
        this.salarioBase = salarioBase;
        this.nome = nome;
        this.Cpf = Cpf;
        this.porcentagemComissao = 0.1;
    }

    public String GetDados(double vendas){
        double comissao = comissao(vendas);
        double SalarioMes = GetSalarioMes(vendas);
        return "Nome: " + this.getNome() + "\n" + "Salário do base: " + this.getSalarioBase() + "\n" + "Salário do mês: " + getSalarioMes() + "\n"+ "Porcentagem de comissão: "+ getPorcentagemComissao() *100+"%"+ "\n" + "Comissão: " + comissao ;
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

    public boolean aumentarSalarioBaseVendedor(Vendedor vendedor){
        if (vendedor.getGerente().equals(this)){
            System.out.println("Funfou");
            return true;
        }
        else {
            System.out.println("Deu merda");
            return false;
        }
    }
}
