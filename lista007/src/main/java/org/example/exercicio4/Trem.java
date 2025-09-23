package org.example.exercicio4;

public class Trem implements IMeioTransporte {
    private int velocidade;

    public Trem(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = this.velocidade + velocidade;
    }

    @Override
    public void frear() {
        setVelocidade(-15);
    }

    @Override
    public void acelerar() {
        setVelocidade(20);
    }
}
