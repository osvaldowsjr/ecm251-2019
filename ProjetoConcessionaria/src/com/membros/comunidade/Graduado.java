package com.membros.comunidade;

public class Graduado extends Membro {
    public String curso;

    public Graduado(String nome, String cpf, String curso){
        super(nome,cpf);
        this.curso = curso;

    }

    @Override
    public String getDados() {
        return super.getDados() + "\nCurso: " + this.curso;
    }
}
