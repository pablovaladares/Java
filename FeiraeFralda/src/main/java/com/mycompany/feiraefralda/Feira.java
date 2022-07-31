package com.mycompany.feiraefralda;
public class Feira {
    String local;
    String formapagamento;
    float valortotal;
    void status() {
        System.out.println("A feira será no: " + this.local);
        System.out.println("A forma de pagamento será em: " + this.formapagamento);
        System.out.println("O valor total da compra será de: " + this.valortotal);
    }
    void carooubarato() {
        if (valortotal > 300) {
        System.out.println("A compra será cara!");
    } else {
            System.out.println("A compra será barata!");
        }
    } 
}
