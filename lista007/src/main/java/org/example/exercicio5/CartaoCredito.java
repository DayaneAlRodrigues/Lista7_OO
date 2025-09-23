package org.example.exercicio5;

import java.math.BigDecimal;

public class CartaoCredito extends FormaPagamento {
    private String numeroCartao;

    public CartaoCredito(String numeroCartao) {
        try {
            if(validarPagamento())
                this.numeroCartao = numeroCartao;
        }catch (PagamentoInvalidoException error){
            System.out.println(error);
        }
    }

    @Override
    public boolean validarPagamento() throws PagamentoInvalidoException {
        if (numeroCartao == null || numeroCartao.length() != 16 )
            throw new PagamentoInvalidoException("Número do cartão inválido");

        return true;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("O Pagamento está sendo processado...");

        System.out.println("Houve um erro no pagamento");
    }
}
