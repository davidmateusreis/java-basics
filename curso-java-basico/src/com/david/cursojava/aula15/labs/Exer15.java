package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe a medida do lado 1:");
        double lado1 = scan.nextDouble();
        System.out.println("Informe a medida do lado 2:");
        double lado2 = scan.nextDouble();
        System.out.println("Informe a medida do lado 3:");
        double lado3 = scan.nextDouble();

        if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) || ((lado2 + lado3) > lado1)) {
            System.out.println("É um triângulo.");

            if (lado1 == lado2 && lado1 == lado3) {
                System.out.println("É um triângulo equilátero.");
            } else if (lado1 != lado2 && lado1 != lado3 && lado3 != lado2) {
                System.out.println("É um triângulo escaleno.");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("É um triângulo isóceles");
            }

        } else {
            System.out.println("Não é um triângulo!");
        }
    }
}
