package org.example.exercicio5;

import java.math.BigDecimal;

public abstract class FormaPagamento {

    public abstract boolean validarPagamento() throws PagamentoInvalidoException;
    public abstract void processarPagamento(BigDecimal valor);
}
