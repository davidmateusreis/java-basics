package com.david.cursojava.aula19.labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer20 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        double[] cotacoes = new double[20];
        double cotacao;

        System.out.println("Qual é a cotação do dólar?");
        cotacao = scan.nextDouble();

        for (int i = 0; i < cotacoes.length; i++) {
            cotacoes[i] = cotacao * (i + 1);
        }

        DecimalFormat formato = new DecimalFormat("###,##.##");

        System.out.println("O vetor cotações");
        for (int i = 0; i < cotacoes.length; i++) {
            System.out.println(formato.format(cotacoes[i]) + " ");
        }   
    }
}
