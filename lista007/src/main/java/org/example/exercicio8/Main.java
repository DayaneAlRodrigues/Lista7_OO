package org.example.exercicio8;

import java.math.BigDecimal;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String cepValido = "90570001";
        String cepInvalido = "0088";
        BigDecimal valorPedido = new BigDecimal("150.00");


        Pedido p1 = new Pedido(cepValido, new Sedex());
        try {
            System.out.println("Frete Sedex para " + p1.getCep() + ": R$" + p1.calcularFrete());
        } catch (CepInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("\n--- Trocando para a Estratégia PAC ---");
        p1.setCalculadoraFrete(new Pac());
        try {
            System.out.println("Frete PAC para " + p1.getCep() + ": R$" + p1.calcularFrete());
        } catch (CepInvalidoException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        System.out.println("\n--- Trocando para a Estratégia Retirada na Loja ---");
        p1.setCalculadoraFrete(new RetiradaNaLoja());
        System.out.println("Frete para Retirada na Loja: R$" + p1.calcularFrete());

        // --- 4. Usando a estratégia promocional com Lambda
        System.out.println("\n--- Trocando para a Estratégia Promocional (Lambda) ---");
        Pedido pedidoComPromocao = new Pedido("33333333", FretePromocionalLambda.criarEstrategia(valorPedido));
        System.out.println("Frete Promocional para " + pedidoComPromocao.getCep() + ": R$" + pedidoComPromocao.calcularFrete());

        // --- 5. Demonstração de erro com CEP inválido
        System.out.println("\n--- Demonstração de CEP Inválido ---");
        Pedido pedidoInvalido = new Pedido(cepInvalido, new Sedex());
        try {
            pedidoInvalido.calcularFrete();
        } catch (CepInvalidoException e) {
            System.err.println("Erro esperado: " + e.getMessage());
        }
    }
}