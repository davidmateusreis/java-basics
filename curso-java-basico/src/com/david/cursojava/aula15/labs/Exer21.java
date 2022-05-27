package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos litros?");
        double litros = scan.nextDouble();
        System.out.println("Álcool ou Gasolina? A/G");
        String combustivel = scan.next();

        double precoAlcool = 1.90;
        double precoGasolina = 2.50;
        double percentualDesconto = 0;
        double total = 0;
        double totalDesconto = 0;

        if (tipo.equalsIgnoreCase("a")) {
            
            if (litros <= 20) {
                percentualDesconto = 3;
            } else {
                percentualDesconto = 5;
            }
            total = litros * precoAlcool;
        } else if (tipo.equalsIgnoreCase("g")) {
            if (litros <= 20) {
                percentualDesconto = 4;
            } else {
                percentualDesconto = 6;
            }
            total = litros * precoGasolina;
        }
        totalDesconto = (total / 100) * percentualDesconto;
        double precoAPagar = total - totalDesconto;

        System.out.println("O valor a ser pago é R$" + precoAPagar + ".");
    }
}
