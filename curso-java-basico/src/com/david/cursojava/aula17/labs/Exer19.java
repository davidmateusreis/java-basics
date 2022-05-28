package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas?");
        double notas = scan.nextDouble();

        double soma = 0;
        double media;
        double nota;

        for (int i = 0; i < notas; i++) {
            System.out.println("Informe a nota " + (i + 1));
            nota = scan.nextDouble();

            soma += nota;
        }

        media = soma / notas;

        System.out.println("A soma é " + soma + ".");
        System.out.println("A média é " + media + ".");
    }
}
