package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer22 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quantos CDs você tem na coleção?");
        int quantidadeCDs = scan.nextInt();

        double valorTotal = 0;

        for (int i = 1; i <= quantidadeCDs; i++) {

            System.out.println("Quanto custou o CD " + i + "?");
            double valorCD = scan.nextDouble();

            valorTotal += valorCD;
            
        }
        double media = valorTotal / quantidadeCDs;

        System.out.println("O valor total investido foi de R$" + valorTotal + ". E o valor médio gasto em cada CD foi R$" + media + ".");
    }
}
