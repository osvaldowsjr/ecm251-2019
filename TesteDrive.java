package com.membros.comunidade;

public class TesteDrive {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Dougras","40985638869","17.04091-4");
        Graduado g1 = new Graduado("Irineu","89608259800","Computação");
        Funcionario f1 = new Funcionario("Jailson","69696969669");
        Professor p1 = new Professor("Joel","52165478954","Artes ");
        Empregado e1 = new Empregado("Maria","33333333390");


        System.out.println(a1.getDados());
        System.out.println(g1.getDados());
        System.out.println(f1.getDados());
        System.out.println( p1.getDados());
        System.out.println(e1.getDados());
    }

}
