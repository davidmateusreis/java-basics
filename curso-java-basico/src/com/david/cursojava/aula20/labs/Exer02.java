package com.david.cursojava.aula20.labs;

import java.util.Random;

public class Exer02 {
    
    public static void main(String[] args) {
        
        int[][] numerosAleatorios = new int[10][10];

        Random numeroAleatorio = new Random();

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                numerosAleatorios[i][j] = numeroAleatorio.nextInt(100);
            }
        }

        for (int i = 0; i < numerosAleatorios.length; i++) {
            for (int j = 0; j < numerosAleatorios[i].length; j++) {
                System.out.print(numerosAleatorios[i][j] + " ");
            }
            System.out.println();
        }

        int maiorL5 = 0;
        int menorL5 = 101;
        int linha5 = 5;
        for (int i = 0; i < numerosAleatorios[linha5].length; i++) { //linha fixa e colunas variáveis  
            if (numerosAleatorios[linha5][i] > maiorL5) {
                maiorL5 = numerosAleatorios[linha5][i];
            }
            if (numerosAleatorios[linha5][i] < menorL5) {
                menorL5 = numerosAleatorios[linha5][i];
            }
        }
        System.out.println("O maior valor da linha cinco é " + maiorL5 + " e o menor é " + menorL5 + ".");

        int maiorC7 = 0;
        int menorC7 = 101;
        int coluna7 = 7;
        for (int i = 0; i < numerosAleatorios.length; i++) { //linhas variáveis e coluna fixa
            if (numerosAleatorios[i][coluna7] > maiorC7) {
                maiorC7 = numerosAleatorios[i][coluna7];
            }
            if (numerosAleatorios[i][coluna7] < menorC7) {
                menorC7 = numerosAleatorios[i][coluna7];
            }
        }


        System.out.println("O maior valor da linha sete é " + maiorC7 + " e o menor é " + menorC7 + ".");

    }
}
