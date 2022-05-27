package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean infoValida = false;
        String nome, sexo, estadoCivil;
        int idade;
        double salario;


        do {
            System.out.println("Qual é o seu nome?");
            nome = scan.next();
            if (nome.length() >= 3) {
                infoValida = true;
            } else {
                System.out.println("O nome precisa ter no mínimo três caracteres.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Qual é a sua idade?");
            idade = scan.nextInt();
            if (idade >= 0 && idade <= 150) {
                infoValida = true;
            } else {
                System.out.println("A idade precisa estar entre zero e cento e cinquenta.");
            }
        } while (!infoValida);
        
        infoValida = false;
        do {
            System.out.println("Quanto você ganha por mês?");
            salario = scan.nextDouble();
            if (salario > 0) {
                infoValida = true;
            } else {
                System.out.println("O salário precisa ser maior que zero.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Qual é o seu sexo?");
            sexo = scan.next();
            if (sexo.equalsIgnoreCase("m") || sexo.equalsIgnoreCase("f")) {
                infoValida = true;
            } else {
                System.out.println("O sexo precisa ser 'masculino' ou 'feminino'.");
            }
        } while (!infoValida);

        infoValida = false;
        do {
            System.out.println("Qual é o seu Estado Civil?");
            estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v") || estadoCivil.equalsIgnoreCase("d")) {
                infoValida = true;
            } else {
                System.out.println("O Estado Civil precisa ser 'solteiro', 'casado', 'viúvo' ou 'divorciado'.");
            }
        } while (!infoValida);

        System.out.println("Você se chama " + nome + ", tem " + idade + " anos, " + "ganha " + salario + ", é " + sexo + " e está " + estadoCivil + " atualmente.");
    }
}
