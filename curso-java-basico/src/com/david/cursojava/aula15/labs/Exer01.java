package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scan.nextInt();
        System.out.println("Agora direi qual deles é o maior!");

        if (n1 > n2 ) {
            System.out.println("O maior número é o " + n1 + ".");
        } else {
            System.out.println("O maior número é o " + n2 + ".");
        }
    }
}
