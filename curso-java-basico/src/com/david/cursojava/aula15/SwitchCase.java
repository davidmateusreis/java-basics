package com.david.cursojava.aula15;

import java.util.Scanner;

public class SwitchCase {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Que dia é hoje?");

        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo!");
        } else if (diaSemana == 2) {
            System.out.println("Segunda!");
        } else if (diaSemana == 3) {
            System.out.println("Terça!");
        } else if (diaSemana == 4) {
            System.out.println("Quarta!");
        } else if (diaSemana == 5) {
            System.out.println("Quinta!");
        } else if (diaSemana == 6) {
            System.out.println("Sexta!");
        } else if (diaSemana == 7) {
            System.out.println("Sábado!");
        } else {
            System.out.println("A semana só tem 7 dias.");
        }


        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é Domingo!");
                break;
            case 2:
                System.out.println("Hoje é Segunda");
                break;
            case 3:
                System.out.println("Hoje é Terça!");
                break;
            case 4:
                System.out.println("Hoje é Quarta!");
                break;
            case 5:
                System.out.println("Hoje é Quinta!");
                break;
            case 6:
                System.out.println("Hoje é Sexta!");
                break;
            case 7:
                System.out.println("Hoje é Sábado!");
                break;
            default:
                System.out.println("A semana só tem 7 dias!");
        }


        switch (diaSemana) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("É dia útil.");
                break;
            case 1:
                System.out.println("É fim de semana!");
                break;
            case 7:
                System.out.println("É fim de semana!");
                break;
            default:
                System.out.println("A semana só tem 7 dias!");
        }
        
    }
}
