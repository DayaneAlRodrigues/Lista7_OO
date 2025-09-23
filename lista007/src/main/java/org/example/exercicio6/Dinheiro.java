package org.example.exercicio6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Dinheiro {
    public enum Moeda {
        BRL, USD
    }
    private final BigDecimal valor;
    private final Moeda moeda;

    public Dinheiro(BigDecimal valor, Moeda moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public Moeda getMoeda() {
        return this.moeda;
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Dinheiro dinheiro = (Dinheiro) o;
        return valor.compareTo(dinheiro.valor) == 0 && moeda == dinheiro.moeda;
    }

    @Override
    public int hashCode(){
        return Objects.hash(valor,moeda);
    }

    public static Dinheiro of(BigDecimal valor, Moeda moeda){
        if(valor == null || valor.compareTo(BigDecimal.ZERO) < 0)
            throw new IllegalArgumentException("O valor não pode ser negativo");

        return new Dinheiro(valor.setScale(2, RoundingMode.HALF_EVEN), moeda);
    }

    @Override
    public String toString(){
        return String.format("%s %.2f", moeda , valor);
    }
}
