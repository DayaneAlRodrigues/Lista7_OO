package org.example.exercicio6;

import java.math.BigDecimal;
import java.util.Objects;

public class ItemCarrinho {
    private final ProdutoCarrinho produto;
    private final int quantidade;

    public ItemCarrinho(ProdutoCarrinho produto, int quantidade) {
        if(quantidade < 1)
            throw new IllegalArgumentException("A quantidade deve ser maior que zero");

        this.produto = Objects.requireNonNull(produto);
        this.quantidade = quantidade;
    }

    public ProdutoCarrinho getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public Dinheiro getSubTotal(){
        return Dinheiro.of(produto.getPreco().getValor().multiply(new BigDecimal(quantidade)), produto.getPreco().getMoeda());
    }
}
