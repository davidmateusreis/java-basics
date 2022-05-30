package com.david.cursojava.aula19.labs;

import java.util.Scanner;

public class Exer33 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] vetorA = new int[5];

        boolean primo = true;
        String msg;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("Informe a posição " + i + " do vetor A.");
            vetorA[i] = scan.nextInt();
        }

        for (int i = 0; i < vetorA.length; i++) {

            primo = true;
            for (int j = 2; j < vetorA[i]; i++) {
                if (vetorA[i] % j == 0) {
                    primo = false;
                    break;
                }
            }

            msg = "";
            if (primo) {
                msg = " é primo";
            } else {
                msg = " não é primo";
            }

            System.out.println(vetorA[i] + msg);
        }

    }
}
