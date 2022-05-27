package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double popA, popB, taxaA, taxaB;

        boolean valido = false;

        do {
            System.out.println("Qual é a população A?");
            popA = scan.nextDouble();
            
            if (popA > 0) {
                valido = true;
            } else {
                System.out.println("A população A precisa ser maior do que zero.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Qual é a população B?");
            popB = scan.nextDouble();
            
            if (popB > 0) {
                valido = true;
            } else {
                System.out.println("A população B precisa ser maior do que zero.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Qual é a taxa de crescimento da população A?");
            taxaA = scan.nextDouble();
            
            if (taxaA > 0) {
                valido = true;
            } else {
                System.out.println("A taxa da população A precisa ser maior do que zero.");
            }
        } while (!valido);

        valido = false;
        do {
            System.out.println("Qual é a taxa de crescimento da população B?");
            taxaB = scan.nextDouble();
            
            if (taxaB > 0) {
                valido = true;
            } else {
                System.out.println("A taxa da população B precisa ser maior do que zero.");
            }
        } while (!valido);

        int cont = 0;

        while (popA < popB) {
            popA += (popA / 100) * taxaA;
            popB += (popB / 100) * taxaB;
            cont++;
        }

        System.out.println("População A: " + popA);
        System.out.println("População B: " + popB);
        System.out.println("Quantidade de anos: " + cont + ".");
    }
}
