package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        boolean notaValida = false;

        do {
            System.out.println("Informe uma nota entre zero e dez.");

            double nota = scan.nextDouble();
            
            if (nota >= 0 && nota <= 10) {
                notaValida = true;
                System.out.println("Você informou a nota " + nota + ".");
            } else {
                System.out.println("A nota que você informou é inválida, digite novamente.");
            }
        } while (!notaValida);
    }
}
