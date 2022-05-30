package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer17 {
    
    private static int[] idades = new int[10];

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < idades.length; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ".");
            idades[i] = scan.nextInt();   
        }

        int qtd = 0;
        for (int i = 0; i < idades.length; i++) {
                if (idades[i] > 35) {
                    qtd++;
                } 
        }

        System.out.print("O vetor de idades de pessoas é = ");
        for (int i = 0; i < idades.length; i++) {
            System.out.print(idades[i] + " ");
        }
        System.out.println();
        System.out.println("A quantidade de pessoas com idade acima de 35 anos é " + qtd + ".");
    }
}
