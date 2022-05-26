package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("E qual é o total de horas trabalhadas por mês?");
        double HorasMes = scan.nextDouble();
        
        double salarioBruto = valorHora * HorasMes;
        double inss = (salarioBruto / 100 ) * 8;
        double sindicato = (salarioBruto / 100) * 5;
        double impostoRenda = (salarioBruto / 100) * 11;
        double totalDescontos = inss + sindicato + impostoRenda;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("O salário Bruto é R$" + salarioBruto + ".");
        System.out.println("Você pagou ao INSS R$" + inss + ".");
        System.out.println("Você também pagou ao Sindicato R$" + sindicato + ".");
        System.out.println("E também pagou ao Imposto de Renda R$" + impostoRenda + ".");
        System.out.println("O total de descontos é de R$" + totalDescontos + ".");
        System.out.println("Sendo assim, seu salário líquido é de R$" + salarioLiquido + "." );

    }
}
