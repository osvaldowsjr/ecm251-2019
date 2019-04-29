package com.Exe;

import java.util.ArrayList;
import java.util.List;


public class ListaDeCompras {
    private List<Produto> produtos;

    public ListaDeCompras(){
        produtos = new ArrayList<Produto>();
    }


    public boolean AdicionarProduto(Produto p){
        if (p == null)
            return false;
        else {
            produtos.add(p);
            return true;
        }
    }
    public boolean RemoverProduto(String nome){
         return  produtos.remove(new Produto(nome));
    }
}
