package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o preço do primeiro produto:");
        double preco1 = scan.nextDouble();
        System.out.println("Informe o preço do segundo produto:");
        double preco2 = scan.nextDouble();
        System.out.println("Informe o preço do terceiro produto:");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3) {
            System.out.println("Vou comprar o produto que custa R$" + preco1 + ".");
        } else if (preco2 <= preco1 && preco2 <= preco3) {
            System.out.println("Vou comprar o produto que custa R$" + preco2 + ".");
        } else {
            System.out.println("Vou comprar o produto que custa R$" + preco3 + ".");
        }
    }
}
