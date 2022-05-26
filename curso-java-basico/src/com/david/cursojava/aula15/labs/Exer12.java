package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da hora trabalhada:");
        double horaTrabalhada = scan.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas por mês:");
        double horasPorMes = scan.nextDouble();

        double salarioBruto = horaTrabalhada * horasPorMes;

        int percentualIr = 0;
        if (salarioBruto <= 900) {
            percentualIr = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500){
            percentualIr = 5;
        } else if (salarioBruto > 1500 && salarioBruto <= 2500) {
            percentualIr = 10;
        } else if (salarioBruto > 2500) {
            percentualIr = 20;
        }


        double impostoRenda = (salarioBruto / 100) * percentualIr;
        double inss = (salarioBruto / 100) * 10;
        double fgts = (salarioBruto / 100) * 11;

        double totalDescontos = impostoRenda + inss;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: (" + horaTrabalhada + "*" + horasPorMes + ") :R$" + salarioBruto);
        System.out.println("(-) IR (5%) :R$" + impostoRenda);
        System.out.println("(-) INSS (10%) :R$" + inss);
        System.out.println("FGTS (11%): R$" + fgts + ".");
        System.out.println("Total de Descontos :R$" + totalDescontos);
        System.out.println("Salário Líquido :R$" + salarioLiquido);
    }
}
