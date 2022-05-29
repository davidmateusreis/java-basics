package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer33 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de N:");
        int n = scan.nextInt();
        double soma = 0;

        for (int i = 1, j = 1; i <= n; i++, j+=2) { //mais de uma variável

            System.out.print(i + "/" + j + " + ");

            soma += i / j;
        }

        System.out.println("\nS = " + soma + ".");
    }
}
