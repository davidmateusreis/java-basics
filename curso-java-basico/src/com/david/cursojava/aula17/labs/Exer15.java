package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer15 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o n-ésimo termo da série de Fibonacci:");
        int n = scan.nextInt();

        int primeiro = 1;
        int segundo = 1;
        int proximo = 0;

        //1, 1, 2, 3, 5
        //primeiro = 1
        //segundo = 1
        //proximo = 2

        System.out.println(primeiro);
        System.out.println(segundo);

        for (int i = 3; i <= n; i++) {

            proximo = primeiro + segundo;
            primeiro  = segundo;
            segundo = proximo;

            System.out.println(proximo);
        }
        


    }
}
