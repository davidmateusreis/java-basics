package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer14 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int num;
        int pares = 0;
        int impares = 0;

        for (int i = 0; i < 10; i++) {

            System.out.println("Informe números até que eu pare de pedir:");
            num = scan.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Você informou " + pares + " números pares " + "e " + impares + " números ímpares.");
    }
}
