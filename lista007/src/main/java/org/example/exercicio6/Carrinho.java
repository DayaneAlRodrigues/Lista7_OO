package org.example.exercicio6;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class Carrinho {
    private final List<ItemCarrinho> itens;
    private final Dinheiro cupomDesconto;
    private static final BigDecimal LIMITE_CUPOM = new BigDecimal("0.30");

    public Carrinho() {
        this.itens = List.of();
        this.cupomDesconto = Dinheiro.of(BigDecimal.ZERO, Dinheiro.Moeda.BRL);
    }

    private Carrinho(List<ItemCarrinho> itens, Dinheiro cupomDesconto) {
        this.itens = List.copyOf(itens);
        this.cupomDesconto = Objects.requireNonNull(cupomDesconto);
    }

    public Carrinho adicionarItem(Produto produto, int quantidade){
        List<ItemCarrinho> novosItens = new ArrayList<>(this.itens);
        Optional<ItemCarrinho> itemExistente = novosItens.stream().filter(i -> i.getProduto().equals(produto)).findFirst();

        if (itemExistente.isPresent()) {
            novosItens.remove(itemExistente.get());
            novosItens.add(new ItemCarrinho(produto, itemExistente.get().getQuantidade() + quantidade));
        } else {
            novosItens.add(new ItemCarrinho(produto, quantidade));
        }

        return new Carrinho(novosItens, this.cupomDesconto);
    }

    public Carrinho removerItem(org.example.exercicio1e2.Produto produto) {
        List<ItemCarrinho> novosItens = this.itens.stream()
                .filter(item -> !item.getProduto().equals(produto))
                .collect(Collectors.toList());

        return new Carrinho(novosItens, this.cupomDesconto);
    }

    public Carrinho aplicarCupom(BigDecimal percentual) {
        if (percentual.compareTo(LIMITE_CUPOM) > 0) {
            throw new IllegalArgumentException("O cupom não pode ser maior que 30%.");
        }

        Dinheiro.Moeda moeda = this.getValorTotal().getMoeda();
        BigDecimal valorDesconto = this.getValorTotal().getValor().multiply(percentual);

        return new Carrinho(this.itens, Dinheiro.of(valorDesconto, moeda));
    }

    public Dinheiro getValorTotal() {
        BigDecimal total = this.itens.stream()
                .map(item -> item.getSubTotal().getValor())
                .reduce(BigDecimal.ZERO, BigDecimal::add);

        return Dinheiro.of(total, Dinheiro.Moeda.BRL);
    }

    public Dinheiro getValorFinal() {
        return Dinheiro.of(this.getValorTotal().getValor().subtract(this.cupomDesconto.getValor()), Dinheiro.Moeda.BRL);
    }

    public List<ItemCarrinho> getItens() {
        return itens;
    }

    public Dinheiro getCupomDesconto() {
        return cupomDesconto;
    }
}


