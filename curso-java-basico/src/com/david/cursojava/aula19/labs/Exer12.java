package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a posição " + i + " do vetor.");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        for (int i = 0; i < vetorA.length; i++) {
            soma += vetorA[i];
        }

        System.out.print("O vetor A é = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A soma dos valores de todas as posições é " + soma  + ".");
    }
}
