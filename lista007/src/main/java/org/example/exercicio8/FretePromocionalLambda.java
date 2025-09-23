package org.example.exercicio8;

import java.math.BigDecimal;

public class FretePromocionalLambda {
    private static final BigDecimal VALOR_LIMITE = new BigDecimal ("100.00");

    public static CalculadoraFrete criarEstrategia(BigDecimal valor){
        if(valor.compareTo(VALOR_LIMITE) >= 0)
            return (cep) -> BigDecimal.ZERO;

        return (cep) -> new BigDecimal("10.00");
    }
}
