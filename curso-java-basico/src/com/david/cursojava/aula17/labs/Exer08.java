package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num;
        double media;
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe um número:");
            num = scan.nextInt();

            soma += num;
        }
        media = soma / 5;
        System.out.println("A soma dos números é " + soma + " e a média é " + media + ".");
    }
}
