package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um número inteiro:");
        int n1 = scan.nextInt();
        System.out.println("Digite outro número inteiro:");
        int n2 = scan.nextInt();
        System.out.println("Agora digite um número real:");
        double n3 = scan.nextDouble();

        int resultado1 = (n1 * 2) * (n2 / 2);
        System.out.println("O produto o dobro de " + n1 + " com metade de " + n2 + " é " + resultado1 +".");
        double resultado2 = (n1 * 3) + n3;
        System.out.println("A soma do triplo de " + n1 + n3 + " é " + resultado2 + ".");
        double resultado3 = Math.pow(n3, 3);
        System.out.println("O " + n3 + " elevado ao cubo é " + resultado3 + ".");


    }
}
