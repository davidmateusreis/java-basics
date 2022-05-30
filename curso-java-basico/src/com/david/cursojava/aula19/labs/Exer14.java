package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a posição " + i + " do vetor.");
            vetorA[i] = scan.nextInt();
        }

        int soma = 0;
        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0)
            soma += vetorA[i];
            impar++;
        }

        System.out.print("O vetor A é = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A média de todas as posições ímpares é " + soma + " e a média entre eles é " + (soma / impar) + ".");
    }
}

