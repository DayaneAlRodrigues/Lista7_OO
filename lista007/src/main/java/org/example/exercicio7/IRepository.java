package org.example.exercicio7;

import java.util.List;
import java.util.Optional;

public interface IRepository <T extends Identificavel> {

    public void salvar(T entidade);
    public Optional<T> buscarPorId(String id);
    List<T> listarTodos();
    public void remover(String id) throws EntidadeNaoEncontradaException;
}
