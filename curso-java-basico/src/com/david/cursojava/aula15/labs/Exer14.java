package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual foi a sua nota no primeiro bimestre?");
        double nota1 = scan.nextDouble();
        System.out.println("Qual foi a sua nota no segundo bimestre?");
        double nota2 = scan.nextDouble();

        double media = (nota1 + nota2) / 2;

        String aproveitamento = "";

        if (media >= 9 && media <= 10) {
            aproveitamento = "A";
        } else if (media >= 7.5 && media < 9) {
           aproveitamento = "B";
        } else if (media >= 6 && media < 7.5) {
           aproveitamento = "C";
        } else if (media >= 4 && media < 6) {
            aproveitamento = "D";
        } else {
            aproveitamento = "E";
        }

        System.out.println("A nota do primeiro bimestre é " + nota1 + ".");
        System.out.println("A nota do segundo bimestre é " + nota2 + ".");
        System.out.println("A média entre as duas notas é " + media + ".");
        System.out.println("O aproveitamento é " + aproveitamento + "." );

        switch (aproveitamento) {
            case "A":
            case "B":
            case "C":
                System.out.println("APROVADO!");
                break;
            case "D":
            case "E":
                System.out.println("REPROVADO!");
        }

    }
}
