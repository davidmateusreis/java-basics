package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quer saber se o número é par ou ímpar?");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O número é par!");
        } else {
            System.out.println("O número é ímpar!");
        }
    }
}
