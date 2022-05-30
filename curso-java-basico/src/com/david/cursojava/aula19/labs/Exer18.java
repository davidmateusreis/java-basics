package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer18 {
    
    private static int[] idades = new int[10];

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ".");
            idades[i] = scan.nextInt();   
        }

        int menor = idades[0];
        int indexMenor = 0;
        int maior = idades[0];
        int indexMaior = 0;

        for (int i = 1; i < idades.length; i++) {
            if (idades[i] > maior) {
                maior = idades[i];
                indexMaior = i;
            } else if (idades[i] < menor) {
                menor = idades[i];
                indexMenor = i;
            }
        }

        System.out.print("O vetor idades é = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        System.out.println("A menor idade é " + menor + " e o index é " + indexMenor + ".");
        System.out.println("A menor idade é " + maior + " e o index é " + indexMaior + ".");

    }
}
