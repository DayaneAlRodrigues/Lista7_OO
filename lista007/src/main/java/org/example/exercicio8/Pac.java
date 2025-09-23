package org.example.exercicio8;

import java.math.BigDecimal;

public class Pac implements CalculadoraFrete{
    @Override
    public BigDecimal calcularPedido(String cep) {
        if(cep == null || cep.length() != 8 )
            throw new CepInvalidoException("Cep invalido!");

        return new BigDecimal("15");
    }
}
