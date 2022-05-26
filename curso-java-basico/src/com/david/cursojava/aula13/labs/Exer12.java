package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a sua altura?");
        double altura = scan.nextDouble();

        double pesoIdeal = (72.7 * altura) - 58;
        System.out.println("Se você mede " + altura + " metros, seu peso ideal é " + pesoIdeal + ".");
    }
}
