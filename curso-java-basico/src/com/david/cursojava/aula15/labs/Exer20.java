package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Telefonou para vítima? S/N");
        String resposta1 = scan.next();
        System.out.println("Esteve no local do crime? S/N");
        String resposta2 = scan.next();
        System.out.println("Mora perto da vítima? S/N");
        String resposta3 = scan.next();
        System.out.println("Devia para vítima? S/N");
        String resposta4 = scan.next();
        System.out.println("Já trabalhou com a vítima? S/N");
        String resposta5 = scan.next();

        int contador = 0;

        if (resposta1.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta2.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta3.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta4.equalsIgnoreCase("S")) {
            contador++;
        }
        if (resposta5.equalsIgnoreCase("S")) {
            contador++;
        }

        if ( contador == 2 ) {
            System.out.println("Suspeita.");
        } else if (contador == 3 || contador == 4 ) {
            System.out.println("Cúmplice.");
        } else if (contador == 5) {
            System.out.println("Assassino.");
        } else {
            System.out.println("Inocente.");
        }
    }
}
