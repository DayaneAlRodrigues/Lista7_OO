package org.example.exercicio3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        //TESTES EXERCICIO 3
        List<Funcionario> funcionarios = new ArrayList<>();
        funcionarios.add(new Funcionario("Ana", new BigDecimal("3000")));
        funcionarios.add(new Gerente("Bia", new BigDecimal("5000")));
        funcionarios.add(new Desenvolvedor("Rose", new BigDecimal("4000")));

        for(Funcionario f: funcionarios){
            System.out.println(f.toString());
        }
    }
}
