package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o primeiro número:");
        int n1 =  scan.nextInt();
        System.out.println("Informe o segundo número:");
        int n2 = scan.nextInt();

        int resultado = n1 + n2;

        System.out.println("A soma de " + n1 + " e " + n2 + " é " + resultado + ".");

    }
}
