package com.david.cursojava.aula14;

import java.util.Scanner;

public class IfElse {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");

        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("Você é maior de idade.");
        } else {
            System.out.println("Você é menor de idade.");
        }

        System.out.println("Qual é o preço do item?");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Muito barato, vou levar!");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Ah, tem desconto?");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Vou dar uma olhadinha em outra loja e depois eu volto!");
        } else {
            System.out.println("Nossa, aqui tá muito caro!"); // else opcional caso não precise imprimeir nada!
        }

    }
}
