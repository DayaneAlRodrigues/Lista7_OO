package org.example.exercicio7;

public class Funcionario implements Identificavel{
    private final String nome, id;

    public Funcionario(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String toString(){
        return "Funcionário: " + this.nome + ", com id: " + this.getId();
    }
}
