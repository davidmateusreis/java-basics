package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        double numero1 = scan.nextDouble();
        System.out.println("Informe o segundo número:");
        double numero2 = scan.nextDouble();

        System.out.println("Qual operação você deseja realizar (+ - * /):");
        String operacao = scan.next();

        double resultado = 0;
        boolean valida = true;

        switch (operacao) {
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
            case "*":
                resultado = numero1 * numero2;
                break;
            case "/":
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("Operação inválida!");
                valida = false;
        }

        if (valida) { //flag
            System.out.println("O resultado foi " + resultado + ".");
            if (resultado >= 0) {
                System.out.println("É positivo.");
            } else {
                System.out.println("É negativo.");
            }
            if (resultado % 2 == 0) {
                System.out.println("É par.");
            } else {
                System.out.println("É ímpar.");
            }
        }
    }
}
