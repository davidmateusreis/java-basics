package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer16 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor de a:");
        int a = scan.nextInt();

        if (a == 0) {
            System.out.println("Não é uma equação de 2º grau.");
        } else {
            System.out.println("Informe o valor de b:");
            int b = scan.nextInt();
            System.out.println("Informe o valor de c:");
            int c = scan.nextInt();

            double delta = (b * b) - (4 * a * c);
            if (delta < 0) {
                System.out.println("Delta negativo.");
            } else {

                System.out.println("O valor de delta é " + delta + ".");
                double x1 = ((-b) + Math.sqrt(delta) / (2 * a));
                double x2 = ((-b) - Math.sqrt(delta) / (2 * a));

                System.out.println("O x1 vale " + x1 + ".");
                System.out.println("O x2 vale " + x2 + ".");
            }
        }

        


    }
}
