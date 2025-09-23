package org.example.exercicio5;

import java.math.BigDecimal;

public class Main {
    public static void main (String[] args){
        // TESTES EXERCICIO 5
        BigDecimal valorPagamento = new BigDecimal("150");
        BigDecimal valorPagamentoInvalido = new BigDecimal("-10");
        FormaPagamento cartaoValido = new CartaoCredito("1234567890123456");
        FormaPagamento cartaoInvalido = new CartaoCredito("");

        FormaPagamento boletoValido = new Boleto("66773399940002024");
        FormaPagamento boletoInvalido = new Boleto("");

        FormaPagamento pixValido = new Pix("09045949566");
        FormaPagamento pixInvalido = new Pix("");

            cartaoValido.processarPagamento(valorPagamento);
            boletoValido.processarPagamento(valorPagamento);
            pixValido.processarPagamento(valorPagamento);

            // valores invalidos
            cartaoInvalido.processarPagamento(valorPagamentoInvalido);
            boletoInvalido.processarPagamento(valorPagamentoInvalido);
            pixInvalido.processarPagamento(valorPagamentoInvalido);

    }
}
