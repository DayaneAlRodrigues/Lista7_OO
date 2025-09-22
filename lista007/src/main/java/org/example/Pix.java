package org.example;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void validarPagamento() throws PagamentoInvalidoException {
        if(this.chavePix == null || this.chavePix.trim().isEmpty())
            throw new PagamentoInvalidoException("Chave pix inválida");

        System.out.println("Pagamento validado");
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("Processando pagamento...");

        System.out.println("Não foi possível processar o pagamento!");
    }
}
