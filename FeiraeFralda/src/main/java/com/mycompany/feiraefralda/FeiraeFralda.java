package com.mycompany.feiraefralda;
public class FeiraeFralda {
    public static void main(String[] args) {
    Feira fe1 = new Feira();
    fe1.local = "Atacadão";
    fe1.formapagamento = "Ticket Alimentação";
    fe1.valortotal = 299.99f;
    fe1.status();
    fe1.carooubarato();
    
    Fralda fr1 = new Fralda();
    fr1.modelo = "Huggies";
    fr1.quantidade = 48;
    fr1.tamanho = "Médio";
    fr1.status();
    
    }
}
