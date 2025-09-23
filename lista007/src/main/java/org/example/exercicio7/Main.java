package org.example.exercicio7;

import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args){
        // TESTE REPOSITORIO PARA PRODUTOS
        IRepository<Produto> repoProdutos = new InMemoryRepository<>();
        // instancias de produtos
        Produto impressora = new Produto("A", "Impressora");
        Produto notebook = new Produto("B", "Notebook");
        repoProdutos.salvar(impressora);
        repoProdutos.salvar(notebook);

        System.out.println("Listando todos os produtos: ");
        List<Produto> produtos = repoProdutos.listarTodos();
        produtos.forEach(System.out::println);

        Optional<Produto> buscarP = repoProdutos.buscarPorId("A");
        buscarP.ifPresent(p -> System.out.println("\nProduto encontrado: " + p));

        try {
            repoProdutos.remover("A");
            System.out.println("Produto removido!");
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Produto não foi removido, " + e);
        }

        try {
            repoProdutos.remover("x");
            System.out.println("Produto removido!");
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Produto não foi removido, " + e);
        }

        System.out.println("Testando repo Funcionarios");
        IRepository<Funcionario> repoFuncionarios = new InMemoryRepository<>();
        Funcionario f1 = new Funcionario("Ana", "1");
        Funcionario f2 = new Funcionario("Beto", "2");

        repoFuncionarios.salvar(f1);
        repoFuncionarios.salvar(f2);

        List<Funcionario> funcionarios = repoFuncionarios.listarTodos();
        funcionarios.forEach(System.out::println);

        Optional<Funcionario> buscaF = repoFuncionarios.buscarPorId("2");
        buscaF.ifPresent(funcionario -> System.out.println("Funcionario encontrado: " + funcionario));

        try{
            repoFuncionarios.remover("1");
            System.out.println("Funcionario removido com sucesso!");
        }catch (EntidadeNaoEncontradaException e){
            System.err.println("Não foi possível remover o funcionario, " + e);
        }

        try{
            repoFuncionarios.remover("5");
            System.out.println("Removido ");
        } catch (EntidadeNaoEncontradaException e) {
            System.err.println("Não foi possivel remover o funcionario, pois não existe no repositorio: " + e);
        }

    }
}
