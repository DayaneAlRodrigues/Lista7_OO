package org.example;

import java.math.BigDecimal;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor(String nome, BigDecimal salario) {
        super(nome, salario);
    }

    @Override
    public BigDecimal calcularBonus(){
        BigDecimal dez = new BigDecimal("10");
        BigDecimal cem = new BigDecimal("100");
        BigDecimal bons = getSalario().multiply(dez).divide(cem);
        return bons;
    }

    @Override
    public String toString(){
        return "Funcionário Desenvolvedor " + getNome() +
                " , salário: " + getSalario() +
                " , bônus: " + calcularBonus();
    }
}
