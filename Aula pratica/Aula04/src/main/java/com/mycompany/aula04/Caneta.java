package com.mycompany.aula04;

import java.lang.reflect.Constructor;

public class Caneta {
    private String modelo;
    private String cor;
    private float ponta;

    public Caneta(String modelo, String cor, float ponta) {
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }
    public void status() {
        System.out.println("O modelo da caneta é: " + this.getModelo());
        System.out.println("A ponta da caneta é: " + this.getPonta());
        System.out.println("A cor da caneta é: " + this.getCor());
    }
}
   