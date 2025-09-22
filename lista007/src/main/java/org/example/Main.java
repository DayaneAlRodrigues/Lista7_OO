package org.example;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //testes exercicio 1
        Produto p1 = new Produto("Impressora",1000,3);
        //produto com o nome vazio
        Produto p2 = new Produto("",2000,3);
        //produto com o nome nulo
        Produto p3 = new Produto(null,3000,1);
        //produto com o preço negativo
        Produto p4 = new Produto("Notebook", -4000, 2);
        // produto com a qtdEstoque negativo
        Produto p5 = new Produto("Roteador", 200, -3);
        // produto com todas as entradas invalidas
        Produto p6 = new Produto(null, -6, -5);

        /*
        //testes exercicio 2
        System.out.println(p1.toString());
        p1.aplicarDesconto(20);
        System.out.println(p1.toString());

        // desconto invalido
        Produto p7 = new Produto("Fone", 150, 5);
        System.out.println(p7.toString());
        p7.aplicarDesconto(60);
        */

        //TESTES EXERCICIO 3
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", new BigDecimal("3000")));
        funcionarios.add(new Gerente("Bia", new BigDecimal("5000")));
        funcionarios.add(new Desenvolvedor("Rose", new BigDecimal("4000")));

        for(Funcionario f: funcionarios){
            System.out.println(f.toString());
        }

        //TESTES EXERCICIO 4
        List<IMeioTransporte> transportes = new ArrayList<>();
        transportes.add(new Carro(40));
        transportes.add(new Bicicleta(10));
        transportes.add(new Trem(50));

        for(IMeioTransporte transporte: transportes){
            transporte.acelerar();
            transporte.frear();
            System.out.println(transporte.getVelocidade());
        }

        // TESTES EXERCICIO 5
        BigDecimal valorPagamento = new BigDecimal("150");
        BigDecimal valorPagamentoInvalido = new BigDecimal("-10");
        FormaPagamento cartaoValido = new CartaoCredito("1234567890123456");
        FormaPagamento cartaoInvalido = new CartaoCredito("");

        FormaPagamento boletoValido = new Boleto("66773399940002024");
        FormaPagamento boletoInvalido = new Boleto("");

        FormaPagamento pixValido = new Pix("09045949566");
        FormaPagamento pixInvalido = new Pix("");

        try{
            cartaoValido.validarPagamento();
            boletoValido.validarPagamento();
            pixValido.validarPagamento();
            cartaoValido.processarPagamento(valorPagamento);
            boletoValido.processarPagamento(valorPagamento);
            pixValido.processarPagamento(valorPagamento);

            // valores invalidos
            cartaoInvalido.validarPagamento();
            boletoInvalido.validarPagamento();
            pixInvalido.validarPagamento();
            cartaoInvalido.processarPagamento(valorPagamentoInvalido);
            boletoInvalido.processarPagamento(valorPagamentoInvalido);
            pixInvalido.processarPagamento(valorPagamentoInvalido);

        }catch (PagamentoInvalidoException error){
            System.out.println(error);
        }

        // TESTES EXERCICIO 6



    }
}