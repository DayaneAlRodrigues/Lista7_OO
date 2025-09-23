package org.example.exercicio4;

public class Carro implements IMeioTransporte {
    private int velocidade;

    public int getVelocidade() {
        return velocidade;
    }

    public Carro(int velocidade) {
        this.velocidade = velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = this.velocidade + velocidade;
    }

    @Override
    public void frear() {
        setVelocidade(- 5);
    }

    @Override
    public void acelerar() {
        setVelocidade(10);
    }
}
