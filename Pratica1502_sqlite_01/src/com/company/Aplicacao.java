package com.company;

import auxiliar_database.SingletonUsuarioDAO;
import model.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aplicacao {
    private List<Usuario> users;
    public Aplicacao(){
        users = new ArrayList<>();
    }
    public void run(){
        Scanner scanner = new Scanner(System.in);
        do{
            menu();
            int op = scanner.nextInt();
            int id;
            Usuario usuario;
            switch (op){
                case 1:
                    String nome, email, senha;
                    System.out.println("Informe:");
                    nome = scanner.next();
                    email = scanner.next();
                    senha = scanner.next();
                    Usuario user = new Usuario(
                            nome, email, senha
                    );
                    SingletonUsuarioDAO.getInstance().insertUsuario(user);
                    break;
                case 2:
                    users = SingletonUsuarioDAO.getInstance().getAllUsuario();
                    for (Usuario u : users) {
                        System.out.print("ID: " + u.id);
                        System.out.println(" Nome: " + u.nome);
                    }
                    System.out.println("");
                    break;
                case 3:
                    System.out.printf("Insira o ID:");
                    id = scanner.nextInt();
                    usuario = SingletonUsuarioDAO.getInstance().getUsuario(id);
                    if (usuario == null)
                        System.out.println("Usuario não cadastrado");
                    else {
                        System.out.println("ID: " + usuario.id);
                        System.out.println("Nome: " + usuario.nome);
                        System.out.println("Email: " + usuario.email);
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.printf("Insira o ID:");
                    id = scanner.nextInt();
                    usuario = SingletonUsuarioDAO.getInstance().getUsuario(id);
                    if (usuario == null)
                        System.out.println("Usuario não cadastrado");
                    else {
                        System.out.println("ID: " + usuario.id);
                        System.out.println("Nome: " + usuario.nome);
                        System.out.println("Email: " + usuario.email);
                        System.out.println("1 - Nome");
                        System.out.println("2 - Email");
                        System.out.println("3 - Senha");
                        op = scanner.nextInt();
                        System.out.println("Novo valor: ");
                        String temp = scanner.next();
                        switch (op){
                            case 1:usuario.nome = temp; break;
                            case 2:usuario.email = temp; break;
                            case 3:usuario.senha = temp; break;
                        }
                        SingletonUsuarioDAO.getInstance().UpdateUserById(usuario);
                    }
                    System.out.println("");
                    break;
                case 5:
                    System.out.print("Insira o ID para deletar:");
                    id = scanner.nextInt();
                    SingletonUsuarioDAO.getInstance().DeleteUserById(id);
                    break;
                default: return;
            }
        }while(true);
    }
    private void menu(){
        System.out.println("1 - Inserir Usuario");
        System.out.println("2 - Mostrar todos os usuarios");
        System.out.println("3 - Buscar usuario");
        System.out.println("4 - Atualizar usuario");
        System.out.println("5 - Remover usuario");
        System.out.println("0 - Sair");
    }
}
