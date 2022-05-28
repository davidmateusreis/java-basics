package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o primeiro número:");
        int n1 = scan.nextInt();
        System.out.println("Informe o segundo número:");
        int n2 = scan.nextInt();

        for (int i = n1; i <= n2; i++) {
            System.out.println(i);
        } 
    }
}
