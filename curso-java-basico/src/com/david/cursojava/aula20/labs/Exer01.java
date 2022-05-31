package com.david.cursojava.aula20.labs;

import java.util.Random;

public class Exer01 {
    
    public static void main(String[] args) {
        
        int[][] numerosAleatorios = new int[4][4];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroAleatorio.nextInt(100);
            }
        }

        int maior = 0;
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                if (numerosAleatorios[i][j] > maior) {
                    maior = numerosAleatorios[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("O maior valor é " + maior + ".");
        System.out.println("A linha é " + linha + ".");
        System.out.println("A coluna é " + coluna + ".");

    }
}
