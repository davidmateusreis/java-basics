package com.david.cursojava.aula27.labs;

public class Lampada {
    
    String modelo;
    String tensao;
    String cor;
    String tipoDeLuz;
    int potencia;
    int garantiaMeses;
    String[] tipos;
    boolean tipoAbajur;

    boolean ligada;

    void ligar() {
        ligada = true;
    }

    void desligar() {
        ligada = false;
    }

    void mostrarEstado() {
        if (ligada) {
            System.out.println("A lâmpada está ligada.");            
        } else {
            System.out.println("A lâmpada está desligada.");
        }
    }

    void mudarEstado() {
        if (ligada) {
            desligar();
        } else {
            ligar();
        }
    }
}
