package com.membros.comunidade;

public class Aluno extends Membro {
    public String RA;

    public Aluno(String nome, String cpf, String Ra){
        super(nome,cpf);
        this.RA = Ra;
    }

    @Override
    public String getDados() {
        return super.getDados() + "\nRA: " + this.RA;
    }
}
