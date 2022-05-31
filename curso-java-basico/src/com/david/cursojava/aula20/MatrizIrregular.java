package com.david.cursojava.aula20;

import java.util.Scanner;

public class MatrizIrregular {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas pessoas serão entrevistadas?");
        int numEntrevistados = scan.nextInt();

        String[][] nomesFilhos = new String[numEntrevistados][];

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("Quantos filhos você tem?");
            int qtdFilhos = scan.nextInt();

            nomesFilhos[i] = new String[qtdFilhos];

            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println("Qual é o nome do filho número " + (j + 1) + "?");
                nomesFilhos[i][j] = scan.next();
            }
        }

        for (int i = 0; i < nomesFilhos.length; i++) {
            System.out.println("A pessoa " + i + " tem " + nomesFilhos[i].length + " filhos.");
            for (int j = 0; j < nomesFilhos[i].length; j++) {
                System.out.println(nomesFilhos[i][j]);           
            }
        }
        
    }
}
