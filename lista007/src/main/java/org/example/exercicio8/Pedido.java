package org.example.exercicio8;

import java.math.BigDecimal;
import java.util.Objects;

public class Pedido {
    private final String cep;
    private CalculadoraFrete calculadoraFrete;

    public Pedido(String cep, CalculadoraFrete calculadoraFrete) {
        this.cep = Objects.requireNonNull(cep);
        this.calculadoraFrete = Objects.requireNonNull(calculadoraFrete);
    }

    public String getCep() {
        return cep;
    }

    public void setCalculadoraFrete(CalculadoraFrete calculadoraFrete) {
        this.calculadoraFrete = Objects.requireNonNull(calculadoraFrete);
    }

    public BigDecimal calcularFrete(){
        return calculadoraFrete.calcularPedido(this.cep);
    }
}
