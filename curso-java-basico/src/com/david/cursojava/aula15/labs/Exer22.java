package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos kilos de maçãs?");
        double quantidadeMaca = scan.nextDouble();
        System.out.println("Quantos kilos de morango?");
        double quantidadeMorango = scan.nextDouble();

        double precoKgMaca = 0;
        if (quantidadeMaca <= 5) {
            precoKgMaca = 1.8;
        } else {
            precoKgMaca = 1.5;
        }
        double precoKgMorango = 0;
        if (quantidadeMorango <= 5) {
            precoKgMorango = 2.5;
        } else {
            precoKgMorango = 2.2;
        }
        double precoTotalMaca = quantidadeMaca * precoKgMaca;
        double precoTotalMorango = quantidadeMorango * precoKgMorango;

        double precoParcial = precoKgMaca + precoKgMorango;
        double precoTotal = precoParcial;

        if ((quantidadeMaca + quantidadeMorango > 8) || (precoParcial > 25)) {
            precoTotal = precoParcial - ((precoParcial / 100) * 10);
        }
        System.out.println("O preço total é R$" + precoTotal + ".");
        
    }
}
