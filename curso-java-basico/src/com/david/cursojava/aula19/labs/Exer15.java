package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[10];

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a posição " + i + " do vetor.");
            vetorA[i] = scan.nextInt();
        }

        int impar = 0;

        for (int i = 0; i < vetorA.length; i++) {
            if (vetorA[i] % 2 != 0)
            impar++;
        }

        int par = vetorA.length - impar;
        double porcPar = (par * 100) / vetorA.length;
        double porcImpar = 100 - porcPar;

        System.out.print("O vetor A é = ");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }
        System.out.println();
        System.out.println("A porcentagem de números pares é " + porcPar + "% e a procentagem de números ímpares é %" + porcImpar  + ".");

    }
}
