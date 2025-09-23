package org.example.exercicio3;

import java.math.BigDecimal;

public class Gerente extends Funcionario {

    public Gerente(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus(){
        BigDecimal vinte = new BigDecimal("20");
        BigDecimal cem = new BigDecimal("100");
        BigDecimal bons = getSalario().multiply(vinte).divide(cem);
        return  bons;
    }

    @Override
    public String toString(){
        return "Funcionário Gerente " + getNome() +
                " , salário: " + getSalario() +
                " , bônus: " + calcularBonus();
    }
}
