package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer32 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int[] tabuadas = new int[5];
        
        for (int i = 0; i < tabuadas.length; i++) {
            System.out.println("Informe alguns números para saber a tabuada de cada um deles.");
            tabuadas[i] = scan.nextInt();
        }
        for (int i = 0; i < tabuadas.length; i++) {

            System.out.println("Tabuada de " + tabuadas[i]+ ":");
            System.out.println();

            for (int j = 1; j <= 10; j++) {
                System.out.println(j + " X " + tabuadas[i] + " = " + (tabuadas[i] * j));
            }
            System.out.println();
        }

    }
}
