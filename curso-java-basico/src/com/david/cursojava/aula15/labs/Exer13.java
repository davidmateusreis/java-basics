package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Que dia é hoje?");
        int diaSemana = scan.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é Domingo!");
                break;
            case 2:
                System.out.println("Hoje é Segunda!");
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
    }
}
