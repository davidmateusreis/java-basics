package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer30 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n;
        int inicio;
        int fim;

        boolean invalido = true;

        do {

            System.out.println("Qual é a tabuada que você quer?");
            n = scan.nextInt();

            System.out.println("Quer começar de que número?");
            inicio = scan.nextInt();

            System.out.println("Quer terminar em qual número?");
            fim = scan.nextInt();

            if (fim > inicio) {
                invalido = false;
            }
        } while (invalido);

        System.out.println("Tabuada de " + n + ":");
        System.out.println("Começar por: " + inicio);
        System.out.println("Terminar em: " + fim);
        System.out.println();
        System.out.println("Vou montar a tabuada de " + n + " começando em " + inicio + " e terminando em " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            System.out.println(n + " X " + i + " = " + (n * i));
        }
    }
}
