package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalha por mês?");
        double horasMes = scan.nextDouble();

        double salarioMes = valorHora * horasMes;
        System.out.println("o seu salário por mês é " + salarioMes);
    }
}
