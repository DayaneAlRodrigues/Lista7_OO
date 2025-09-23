package org.example.exercicio4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
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
    }
}
