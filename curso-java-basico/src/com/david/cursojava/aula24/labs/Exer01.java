package com.david.cursojava.aula24.labs;

public class Exer01 {
    
    public static void main(String[] args) {
        
        Lampada lampada = new Lampada();

        lampada.modelo = "A60";
        lampada.tensao = "Bivolt";
        lampada.garatiaMeses = 36;
        lampada.potencia = 7;
        lampada.cor = "Amarela";
        lampada.tipoDeLuz = "Amarela";
        lampada.tipoAbajur = true;

        lampada.tipos = new String[4];

        lampada.tipos[0] = "Abajur";
        lampada.tipos[1] = "Lampeões";
        lampada.tipos[2] = "Luminarias";
        lampada.tipos[3] = "Pendentes";

    }
}
