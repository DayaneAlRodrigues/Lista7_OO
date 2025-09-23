package org.example.exercicio5;

import java.math.BigDecimal;

public class Boleto extends FormaPagamento {

    private String codigoBarrras;

    public Boleto(String codigoBarrras) {

        try {
            if(validarPagamento())
                this.codigoBarrras = codigoBarrras;
        }catch (PagamentoInvalidoException error){
            System.out.println(error);
        }
    }

    @Override
    public boolean validarPagamento() throws PagamentoInvalidoException {
        if(codigoBarrras == null || codigoBarrras.trim().isEmpty())
            throw new PagamentoInvalidoException("O código de barras está incorreto!");
        return true;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("Processando pagamento...");

        System.out.println("Não foi possível processar o pagamento.");
    }
}
