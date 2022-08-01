package com.mycompany.aula04;
public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta("Compactor","Amarela",0.5f);
        //c1.status();
        System.out.println("A caneta é da marca " + c1.getModelo() + " possui"
        + " a cor " + c1.getCor() + " e possui ponta tamanho " + c1.getPonta());
        
    }
}
