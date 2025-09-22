package org.example;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento{

    private String codigoBarrras;

    public Boleto(String codigoBarrras) {
        this.codigoBarrras = codigoBarrras;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if(this.codigoBarrras == null || this.codigoBarrras.trim().isEmpty())
            throw new PagamentoInvalidoException("O código de barras está incorreto!");
        System.out.println("Pagamento validado");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("Processando pagamento...");

        System.out.println("Não foi possível processar o pagamento.");
    }
}
