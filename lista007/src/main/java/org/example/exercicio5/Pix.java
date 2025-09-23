package org.example.exercicio5;

import java.math.BigDecimal;

public class Pix extends FormaPagamento {
    private String chavePix;

    public Pix(String chavePix) {
        try{
            if(validarPagamento())
                this.chavePix = chavePix;
        }catch (PagamentoInvalidoException error){
            System.out.println(error);
        }

    }

    @Override
    public boolean validarPagamento() throws PagamentoInvalidoException {
        if(chavePix == null || chavePix.trim().isEmpty())
            throw new PagamentoInvalidoException("Chave pix inválida");

        return true;
    }

    @Override
    public void processarPagamento(BigDecimal valor) {
        if(valor.compareTo(BigDecimal.ZERO) > 0)
            System.out.println("Processando pagamento...");

        System.out.println("Não foi possível processar o pagamento!");
    }
}
