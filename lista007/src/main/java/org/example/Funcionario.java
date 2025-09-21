package org.example;

import java.math.BigDecimal;

public class Funcionario {
    protected String nome;
    protected BigDecimal salario;

    public Funcionario(String nome, BigDecimal salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public String getNome() {
        return this.nome;
    }

    public BigDecimal getSalario() {
        return this.salario;
    }

    public BigDecimal calcularBonus (){
        BigDecimal cinco = new BigDecimal("5");
        BigDecimal cem = new BigDecimal("100");

        BigDecimal bons = getSalario().multiply(cinco).divide(cem);
        return bons;
    }

    @Override
    public String toString(){
        return "Funcionário " + getNome() +
                " , salário: " + getSalario() +
                " , bônus: " + calcularBonus();
    }
}
