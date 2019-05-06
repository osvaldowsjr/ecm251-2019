package com.company;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class SistemaLogin {
    private List<Usuario> listaUsuarios;

    public SistemaLogin (){
        listaUsuarios = new LinkedList<>();
    }


    public void Monitorar(){
        Scanner scanner = new Scanner(System.in);
        while (true){
            ExibirMenu();
            int op = scanner.nextInt();
            AvaliarEscolha(op);
        }
    }

    private void AvaliarEscolha(int op) {
        switch (op){
            case 0 : System.exit(0); break;
            case 1 : Logar(); break;
            case 2 : CadastrarUsuario(); break;
            case 3: ExibirListaDeUsuarios(); break;
            default:
                System.out.println("Sera implementado em versoes futuras!");
        }
    }

    private void Logar() {
        System.out.println("Digite sua senha: ");
        Scanner scanner = new Scanner(System.in);
        String senha;
        senha =scanner.next();


    }

    private void ExibirListaDeUsuarios() {
        if (listaUsuarios.size() == 0){
            System.out.println("Sem Usuários");
        }else {
            System.out.println("Usuarios cadastrados: ");
            for (Usuario user : listaUsuarios
                    ) {
                System.out.println(user.getNome() + " - " + user.getEmail());

            }
        }
    }

    private void CadastrarUsuario() {
        System.out.println("Informe um nome, email e senha: ");
        Scanner scanner = new Scanner(System.in);
        String nome, email, senha;
        nome = scanner.next();
        email = scanner.next();
        senha = scanner.next();
        listaUsuarios.add(new Player(nome, email,senha));
        System.out.println("Cadastrado com sucesso!");


    }

    public void ExibirMenu(){
        System.out.println("1 - Logar");
        System.out.println("2 - Novo Usuario");
        System.out.println("3 - Usuarios cadastrados");
        System.out.println("4 - Trocar senha");
        System.out.println("0 - Sair");
    }


}
