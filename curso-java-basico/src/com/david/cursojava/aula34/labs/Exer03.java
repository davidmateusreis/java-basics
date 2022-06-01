package com.david.cursojava.aula34.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;

        do {
            System.out.println("Calcule o fatorial de um número positivo.");
            num = scan.nextInt();

            if (num < 0) {
                System.out.println("Eu disse POSITIVO!");
            }
        } while (num < 0);

        System.out.println(Calculadora.fatorizar(num));
    }
}
