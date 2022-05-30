package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer37 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[15];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um número para a posição " + i + " do vetor A.");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorA.length; i++) {

            vetorB[i] = 1;
            for (int j = 1; j <= vetorA[i]; j++) {
                vetorB[i] *= j;
            } 
        }

        System.out.print("O vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println();
        System.out.print("O vetor B = ");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();

    }
}
