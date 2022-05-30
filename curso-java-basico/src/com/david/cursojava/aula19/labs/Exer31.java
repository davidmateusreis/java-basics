package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer31 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[20];
        int[] vetorB = new int[vetorA.length]; //pares e ímpares

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe um número para a posição " + i + " do vetor A.");
            vetorA[i] = scan.nextInt();
        }

        int posB = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 ==0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }        
        }

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 !=0) {
                vetorB[posB] = vetorA[i];
                posB++;
            }         
        }

        System.out.print("O vetor A = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        
        System.out.print("O vetor B = ");
        for (int i = 0; i < posB; i++) {
            System.out.print(vetorB[i] + " ");
        }
    }
}
