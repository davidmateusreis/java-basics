package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer16 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a posição " + i + " do vetor.");
            vetorA[i] = scan.nextInt();
        }

        int somaMenor15 = 0;
        int somaMaior15 = 0;
        int qtdMaior15 = 0;
        int igual15 = 0;
        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] == 15) {
                igual15++;
            } else if (vetorA[i] < 15) {
                somaMenor15 += vetorA[i];
            } else {
                qtdMaior15++;
                somaMaior15 += vetorA[i];
            }
        }
        System.out.print("O vetor A é = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A quantidade de números igual a quinza é " + igual15 + ".");
        System.out.println("A soma dos números menores que quinze é " + somaMenor15 + ".");
        System.out.println("A média dos números maiores que quinze é " + (somaMaior15 / qtdMaior15) + ".");
    }
}

