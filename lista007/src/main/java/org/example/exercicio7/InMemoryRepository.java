package org.example.exercicio7;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class InMemoryRepository <T extends Identificavel> implements IRepository<T> {
    private final Map<String, T> bancoDeDados = new HashMap<>();
    @Override
    public void salvar(T entidade) {
        bancoDeDados.put(entidade.getId(), entidade);
    }

    @Override
    public Optional<T> buscarPorId(String id) {
        return Optional.ofNullable(bancoDeDados.get(id));
    }

    @Override
    public List<T> listarTodos() {
        return List.copyOf(bancoDeDados.values());
    }

    @Override
    public void remover(String id) throws EntidadeNaoEncontradaException {
        if(!bancoDeDados.containsKey(id))
            throw new EntidadeNaoEncontradaException("Entidade não encontrada");
        bancoDeDados.remove(id);
    }
}
