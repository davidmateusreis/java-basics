package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o tipo da carne?");
        System.out.println("1 - Filé Duplo");
        System.out.println("2 - Alcatra");
        System.out.println("3 - Picanha");
        int tipoCarne = scan.nextInt();
        System.out.println("Quantos kilos de carne?");
        double quantidadeCarne = scan.nextDouble();

        double precoKg = 0;

        if (tipoCarne == 1) {
            System.out.println(quantidadeCarne + "kilos de Filé Duplo.");
            if (quantidadeCarne < 5) {
                precoKg = 4.9;
            } else {
                precoKg = 5.8;     
            }
        } else if (tipoCarne == 2) {
            System.out.println(quantidadeCarne + "kilos de Filé Alcatra.");
            if (quantidadeCarne < 5) {
                precoKg = 5.9;
            } else {
                precoKg = 6.8;
            }
        } else if (tipoCarne == 3) {
            System.out.println(quantidadeCarne + "kilos de Picanha.");
            if (quantidadeCarne < 5) {
                precoKg = 6.9;
            } else {
                precoKg = 7.8;
            }
        }
        double total = quantidadeCarne * precoKg;
        System.out.println(quantidadeCarne + "kilos * " + precoKg +  " = " + total);

        System.out.println("Qual é o método de pagamento? Se for cartão, digite 1.");
        int cartao = scan.nextInt();

        if (cartao == 1) {
            double desconto = (total / 100) *5;
            System.out.println("O desconto foi de R$" + desconto + ".");
            System.out.println("O valor total a pagar é R$" + (total - desconto));
        } else {
            System.out.println("O valor total a pagar é R$" + total);
        }
            
    }
}
