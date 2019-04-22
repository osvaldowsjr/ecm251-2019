package com.membros.comunidade;

public class Professor extends CorpoDocente {
    public String disciplina;
    public Professor(String nome, String cpf, String disciplina)
    {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    @Override
    public String getDados() {
        return super.getDados() + "\nDisciplina: "+this.disciplina;
    }
}
