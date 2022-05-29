package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer25 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean sair = false;
        String continuarCompra;
        int quantidadeProdutos;
        double preco;
        double total;
        String output;
        double valorPago, troco;

        do {

            System.out.println("Deseja informar uma nova compra? S/N");
            continuarCompra = scan.next();

            if (continuarCompra.equalsIgnoreCase("s")) {

                output = "Lojas Tabajara\n";

                System.out.println("Qual é a quantidade de produtos da compra?");
                quantidadeProdutos = scan.nextInt();

                total = 0;

                for (int i = 1; i <= quantidadeProdutos; i++) {
                    System.out.println("Informe o preço do produto " + i + ".");
                    preco = scan.nextDouble();
                    total += preco;
                    output += "Produto " + i + ":R$" + preco + "\n";
                }

                output += "Total: R$" + total + "\n";
                System.out.println("Total: R$" + total + "\n");

                System.out.println("Informe o valor pago:");
                valorPago = scan.nextDouble();

                output += "Dinheiro: R$" + valorPago + "\n";

                troco = valorPago - total;
                output += "Troco: R$" + troco;

                System.out.println(output);

            } else {
                sair = true;
            }

        } while (!sair);
    }
}
