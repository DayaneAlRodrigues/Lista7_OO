package org.example.exercicio1e2;

public class Main {
    public static void main (String[] args){
        //testes exercicio 1
        Produto p1 = new Produto("Impressora",1000,3);
        //produto com o nome vazio
        Produto p2 = new Produto("",2000,3);
        //produto com o nome nulo
        Produto p3 = new Produto(null,3000,1);
        //produto com o preço negativo
        Produto p4 = new Produto("Notebook", -4000, 2);
        // produto com a qtdEstoque negativo
        Produto p5 = new Produto("Roteador", 200, -3);
        // produto com todas as entradas invalidas
        Produto p6 = new Produto(null, -6, -5);

        /*
        //testes exercicio 2
        System.out.println(p1.toString());
        p1.aplicarDesconto(20);
        System.out.println(p1.toString());

        // desconto invalido
        Produto p7 = new Produto("Fone", 150, 5);
        System.out.println(p7.toString());
        p7.aplicarDesconto(60);
        */

    }
}
