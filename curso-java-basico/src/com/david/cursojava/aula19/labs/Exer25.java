package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer25 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um número para posição " + i + ".");
            vetorA[i] = scan.nextInt();

            vetorB[i] = (vetorA[i] % 2 == 0) ? 1 : 0; //operador ternário
        }

        System.out.println("O vetor ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.println("O vetor B ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
