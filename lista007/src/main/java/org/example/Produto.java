package org.example;

public class Produto {
    private String nome;
    private double preco;
    private int qtdEstoque;

    public Produto(String nome, double preco, int qtdEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.qtdEstoque = qtdEstoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setNome(String nome) throws IllegalArgumentException {
        if (nome == null && nome.isEmpty())
            throw new IllegalArgumentException("O nome do produto não pode ser nulo");
        else
            this.nome = nome;
    }

    public void setPreco(double preco) throws IllegalArgumentException {
        if (preco < 0)
            throw new IllegalArgumentException("o Preço do produto deve ser maior que zero");
        else
            this.preco = preco;
    }

    public void setQtdEstoque(int qtdEstoque) throws IllegalArgumentException{
        if (qtdEstoque < 0)
            throw new IllegalArgumentException("A quantidade do estoque não pode ser menor que zero");
        else
            this.qtdEstoque = qtdEstoque;
    }

    public void aplicarDesconto (double porcentagem){
        if (porcentagem> 0 && porcentagem <=50)
            this.preco = this.preco * porcentagem/100;
        else
            throw new DescontoInvalidoException("O desconto deve estar entre 0 e 50 por cento");
    }

    @Override
    public String toString(){
        return "O produto " + this.getNome() + " , preço: R$" + this.getPreco() +
                " , quantidade em estoque: " + this.getQtdEstoque() + " .";
    }
}
