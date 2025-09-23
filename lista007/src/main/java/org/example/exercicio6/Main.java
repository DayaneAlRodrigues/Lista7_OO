package org.example.exercicio6;

import java.math.BigDecimal;

public class Main {

    public static void main(String[] args){
        // 1. Produtos
        Produto tv = new Produto("Smart TV 50'", Dinheiro.of(new BigDecimal("2500.00"), Dinheiro.Moeda.BRL));
        Produto soundbar = new Produto("Soundbar", Dinheiro.of(new BigDecimal("750.50"), Dinheiro.Moeda.BRL));

        // 2. Criando o carrinho inicial (imutável)
        Carrinho carrinho1 = new Carrinho();
        System.out.println("Carrinho 1 (Vazio): " + carrinho1.getValorTotal());

        // 3. Adicionando item (retorna um novo carrinho)
        Carrinho carrinho2 = carrinho1.adicionarItem(tv, 1);
        System.out.println("Carrinho 2 (TV): " + carrinho2.getValorTotal());

        // 4. Adicionando outro item (retorna outro novo carrinho)
        Carrinho carrinho3 = carrinho2.adicionarItem(soundbar, 1);
        System.out.println("Carrinho 3 (TV + Soundbar): " + carrinho3.getValorTotal());

        // 5. Aplicando cupom (retorna mais um novo carrinho)
        try {
            Carrinho carrinho4 = carrinho3.aplicarCupom(new BigDecimal("0.10")); // 10%
            System.out.println("Valor total do carrinho 3: " + carrinho3.getValorTotal());
            System.out.println("Valor do cupom aplicado (carrinho 4): " + carrinho4.getCupomDesconto());
            System.out.println("Valor final do carrinho 4: " + carrinho4.getValorFinal());

            // Tentando aplicar cupom maior que o limite
            carrinho4.aplicarCupom(new BigDecimal("0.40"));

        } catch (IllegalArgumentException e) {
            System.err.println("Erro ao aplicar cupom: " + e.getMessage());
        }

        // 6. Verificando a imutabilidade
        // O carrinho original (carrinho3) não foi alterado!
        System.out.println("\nImutabilidade demonstrada:");
        System.out.println("Valor do carrinho original (carrinho3) continua: " + carrinho3.getValorTotal());
    }

}

