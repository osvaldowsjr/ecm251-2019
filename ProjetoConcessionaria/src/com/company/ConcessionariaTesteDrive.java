package com.company;

public class ConcessionariaTesteDrive {
    public static void main(String[] args) {
        Gerente g1 = new Gerente(1000,"Carlos","89608259800");

        Vendedor v1 = new Vendedor(10000,"Tadeu","10591302896",g1);

        double totalVendasMes = 10000;

        System.out.println("Vendedor: "+v1.getNome());
        System.out.println("Comissão: " + v1.comissao(totalVendasMes));
        System.out.println("Gerente: "+g1.getNome());
        System.out.println("Comissão: " + g1.comissao(totalVendasMes));

        g1.aumentarSalarioBaseVendedor(v1);
    }
}
