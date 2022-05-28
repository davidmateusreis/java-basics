package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual tabuada você quer ver?");
        int num = scan.nextInt();

        System.out.println("Tabuada de " + num + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }
    }
}
