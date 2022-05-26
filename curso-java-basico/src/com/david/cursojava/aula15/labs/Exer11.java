package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do seu salário atual:");
        double salario = scan.nextInt();

        int percentual = 0;

        if (salario <= 280) {
            percentual = 20;
        } else if (salario > 280 && salario < 700) {
            percentual = 15;
        } else if (salario >= 700 && salario < 1500) {
            percentual = 10;
        } else if (salario >= 1500) {
            percentual = 5;
        }
        double aumento = (salario / 100) * percentual;
        double salarioAjustado = salario + aumento;

        System.out.println("O valor do salário é R$" + salario + ".");
        System.out.println("O percentual aplicado foi de " + percentual + "%.");
        System.out.println("O valor do aumento foi de R$" + aumento + ".");
        System.out.println("Seu novo salário é R$" + salarioAjustado + ".");




    }
}
