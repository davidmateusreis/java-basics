package com.david.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];
        int[] vetorB = new int[vetorA.length];
        double[] vetorC = new double[vetorA.length];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Digite o valor do Vetor A da posição: " + i + ".");
            vetorA[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorB.length; i++) {
            System.out.println("Digite o valor do Vetor B da posição: " + i + ".");
            vetorB[i] = scan.nextInt();
        }
        for (int i = 0; i < vetorC.length; i++) {
            vetorC[i] = vetorA[i] / vetorB[i];
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

        DecimalFormat formato = new DecimalFormat("###,###.##");

        System.out.print("O vetor C = ");
        for (int i = 0; i < vetorC.length; i++) {
            System.out.print(formato.format(vetorC[i]) + " ");
        }
        System.out.println();
    }
}
