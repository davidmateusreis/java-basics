package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer27 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas temperaturas?");
        int qtdTemp = scan.nextInt();

        double temp;
        double soma = 0;
        double menor = Double.MAX_VALUE;
        double maior = Double.MIN_VALUE;

        for (int i = 1; i <= qtdTemp; i++) {
            System.out.println("Informe a a temperatura " + i);
            temp = scan.nextDouble();

            soma += temp;

            if (temp > maior) {
                maior = temp;
            }
            if (temp < menor) {
                menor = temp;
            }
        }

        System.out.println("A média entre todas as temperaturas é " + (soma / qtdTemp));
        System.out.println("A menor temperatura é " + menor + " e a maior temperatura é " + maior + ".");
    }
}
