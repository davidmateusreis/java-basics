package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas idades?");
        int idades = scan.nextInt();

        int idade;
        int soma = 0;

        for (int i = 0; i < idades; i++) {

            System.out.println("Qual é a idade da pessoa " + (i + 1) + "?");
            idade = scan.nextInt();

            soma += idade;
        }
        double media =  soma / idades;

        System.out.println("A média de idade é " + media + ".");

        if (media >= 0 && media <= 25) {
            System.out.println("A turma é jovem.");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A turma é adulta.");
        } else if (media > 60) {
            System.out.println("A turma é idosa.");
        }
    }
}
