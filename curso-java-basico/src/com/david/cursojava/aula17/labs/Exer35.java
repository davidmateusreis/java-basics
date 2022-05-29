package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer35 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o valor de N:");
        double n = scan.nextDouble();

        double soma = 0;

        for (int i = 1, j =1; i <= n; i++, j+=2) {
            
            soma += i / j;
        }

        System.out.println("A soma é " + soma + ".");

    }
}
