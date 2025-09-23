package org.example.exercicio7;

public class Produto implements Identificavel {
    private final String id, nome;

    public Produto(String id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    @Override
    public String getId() {
        return this.id;
    }
    @Override
    public String toString(){
        return "Produto: " + this.nome + ", com id: " + this.getId();
    }
}
