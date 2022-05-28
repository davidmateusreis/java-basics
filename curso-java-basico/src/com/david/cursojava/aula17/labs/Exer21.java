package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer21 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas turmas?");
        int numTurmas = scan.nextInt();

        int numAlunos;
        int soma = 0;
        boolean invalido = true;

        for (int i = 1; i <= numTurmas; i++) {

            invalido = true;
            do {
                System.out.println("Quantos tem a turma " + i + "?");
                numAlunos = scan.nextInt();

                if (numAlunos <= 40) {
                invalido = false;
                } else {
                    System.out.println("O número de alunos é inválido!");
                }

            } while (invalido);

            soma += numAlunos;
        }
        double media =  soma / numTurmas;

        System.out.println("O número médio de alunos por turma é " + media + ".");
    }
}
