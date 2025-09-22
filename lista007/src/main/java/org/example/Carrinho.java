package org.example;

import java.math.BigDecimal;
import java.util.List;

public class Carrinho {
    private final List<ItemCarrinho> itens;
    private final Dinheiro cupomDesconto;
    private static final BigDecimal LIMITE_CUPOM = new BigDecimal("0.30");

    public Carrinho() {
        this.itens = List.of();
        this.cupomDesconto = Dinheiro.of(BigDecimal.ZERO,Dinheiro.Moeda.BRL);
    }

}
