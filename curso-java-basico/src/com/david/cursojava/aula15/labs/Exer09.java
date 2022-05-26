package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int n2 = scan.nextInt();
        System.out.println("Digite o terceiro número:");
        int n3 = scan.nextInt();

        if (n1 <= n2 && n1 <= n3 & n2 <= n3) {
            System.out.println(n3 + " - " + n2 + " - " + n1);
        } else if (n1 <= n2 && n1 <= n3 & n3 <= n2) {
            System.out.println(n2 + " - " + n3 + " - " + n1);
        } else if (n2 <= n1 && n2 <= n3 & n1 <= n3) {
            System.out.println(n3 + " - " + n1 + " - " + n2);
        } else if (n2 <= n1 && n2 <= n3 & n3 <= n1) {
            System.out.println(n1 + " - " + n3 + " - " + n2);
        } else if (n3 <= n1 && n3 <= n2 & n1 <= n2) {
            System.out.println(n2 + " - " + n1 + " - " + n3);
        } else if (n3 <= n1 && n3 <= n2 & n2 <= n1) {
            System.out.println(n1 + " - " + n2 + " - " + n3);
        }
        
    }
}
