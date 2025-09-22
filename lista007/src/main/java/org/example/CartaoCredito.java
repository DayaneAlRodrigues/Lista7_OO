package org.example;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento{
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if (this.numeroCartao == null || this.numeroCartao.length() != 16 )
            throw new PagamentoInvalidoException("Número do cartão inválido");

        System.out.println("Pagamento validado");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("O Pagamento está sendo processado...");

        System.out.println("Houve um erro no pagamento");
    }
}
