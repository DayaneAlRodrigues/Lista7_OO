package org.example.exercicio8;

import java.math.BigDecimal;

public class RetiradaNaLoja implements CalculadoraFrete{
    @Override
    public BigDecimal calcularPedido(String cep) {
        return BigDecimal.ZERO;
    }
}
