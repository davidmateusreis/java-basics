package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer19 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] notas1 = new double[10];
        double[] notas2 = new double[notas1.length];
        double[] resultados = new double[notas1.length];

        for (int i = 0; i < notas1.length; i++) {
            System.out.println("Qual é a nota 1 do aluno " + (i + 1) + "?");
            notas1[i] = scan.nextDouble();
            System.out.println("Qual é a nota 2 do aluno " + (i + 1) + "?");
            notas2[i] = scan.nextDouble();

            resultados[i] = (notas1[i] + notas2[i]) / 2;
        }
        
        System.out.print("As notas 1 = ");
        for (int i = 0; i < notas1.length; i++) {
            System.out.print(notas1[i] + " ");
        }
        System.out.println();

        System.out.print("As notas 2 = ");
        for (int i = 0; i < notas2.length; i++) {
            System.out.print(notas2[i] + " ");
        }
        System.out.println();

        System.out.println("os resultados = ");
        for (int i = 0; i < resultados.length; i++) {
            
            if (resultados[i] >= 7) {
                System.out.println(resultados[i] + " - Aprovado!");
            } else {
                System.out.println(resultados[i] + " - Reprovado!");
            }
        }
    }
}
