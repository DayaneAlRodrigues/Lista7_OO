package org.example.exercicio8;

import java.math.BigDecimal;

public class Sedex implements CalculadoraFrete{
    @Override
    public BigDecimal calcularPedido(String cep) {
        if(cep == null || cep.length() != 8)
            throw new CepInvalidoException("Cep incorreto!");

        return new BigDecimal("30");
    }
}
