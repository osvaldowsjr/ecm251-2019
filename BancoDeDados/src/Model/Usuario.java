package Model;

import utilities.Constants;

public class Usuario {
    public String nome;
    public String email;
    public String senha;
    public int id;

    public Usuario (String nome, String email, String senha){
        this.nome = nome;
        this.senha = senha;
        this.email = email;
        this.id = Constants.ID_NULO;
    }
}
