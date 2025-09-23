package org.example.exercicio6;

import java.util.Objects;

public class ProdutoCarrinho {
    private final String nome;
    private final Dinheiro preco;

    public ProdutoCarrinho(String nome, Dinheiro preco) {
        this.nome = Objects.requireNonNull(nome);
        this.preco = Objects.requireNonNull(preco);
    }


    public String getNome() {
        return nome;
    }

    public Dinheiro getPreco() {
        return preco;
    }

}
