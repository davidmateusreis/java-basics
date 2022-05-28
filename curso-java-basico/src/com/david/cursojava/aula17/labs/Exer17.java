package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual fatorial você quer saber?");
        int n = scan.nextInt();

        int fatorial = 1;

        for (int i = n; i > 0; i--) {
            fatorial *= i;
            
        }
        
        System.out.println("O fatorial de " + n + " é " + fatorial + ".");
    }
}
