package com.david.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        String [][][] compromissos = new String[12][31][8];

        boolean sair = false;
        byte opcao;
        while (!sair) {
            System.out.println("Digite 1 para adicionar compromissos.");
            System.out.println("Digite 2 para verificar compromisso.");
            System.out.println("Digite 0 para sair.");
            opcao = scan.nextByte();

            if (opcao == 1) { //adicionar compromisso
                
                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Informe o mês do ano:");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("O mês é inválido!");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Informe o dia do mês:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("O dia é inválido!");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Informe o horário do compromisso:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 8) {
                        horaValida = true;
                    } else {
                        System.out.println("O horário é inválido!");
                    }
                }
                
                mes--;
                dia--;
                System.out.println("Informe o compromisso:");
                compromissos[mes][dia][hora]  = scan.next();

                
            } else if (opcao == 2) { //verificar compromisso

                boolean mesValido = false;
                int mes = 0;
                while (!mesValido) {
                    System.out.println("Informe o mês do ano:");
                    mes = scan.nextInt();
                    if (mes > 0 && mes <= 12) {
                        mesValido = true;
                    } else {
                        System.out.println("O mês é inválido!");
                    }
                }

                boolean diaValido = false;
                int dia = 0;
                while (!diaValido) {
                    System.out.println("Informe o dia do mês:");
                    dia = scan.nextInt();
                    if (dia > 0 && dia <= 31) {
                        diaValido = true;
                    } else {
                        System.out.println("O dia inválido!");
                    }
                }
                boolean horaValida = false;
                int hora = 0;
                while (!horaValida) {
                    System.out.println("Informe o horário do compromisso:");
                    hora = scan.nextInt();
                    if (hora >= 0 && hora <= 24) {
                        horaValida = true;
                    } else {
                        System.out.println("O horário é inválido!");
                    }
                }

                mes--;
                dia--;
                System.out.println("O compromisso agendado é " );
                System.out.println(compromissos[mes][dia][hora]);

            } else if (opcao == 0) { //sair
                sair = true;
            } else {
                System.out.println("A opção é inválida!");
            }
        }
    }
}
