package com.david.cursojava.aula20.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char[][] jogoDaVelha = new char[3][3];

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        int jogada = 1;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogada % 2 == 1) { // jogador 1
                System.out.println("É a vez do jogador 1. Escolha linha e coluna!");
                sinal = 'X';
            } else {
                System.out.println("É a vez do jogador 2. Escolha linha e coluna!");
                sinal = 'O';
            }

            boolean linhaValida = false;

            while (!linhaValida) {
                System.out.println("Informe a linha (1, 2 ou 3)");
                linha = scan.nextInt();
                if (linha >= 1 && linha <= 3) {
                    linhaValida = true;
                } else {
                    System.out.println("A linha informada é inválida!");
                }
            }

            boolean colunaValida = false;

            while (!colunaValida) {
                System.out.println("Informe a coluna (1, 2 ou 3)");
                coluna = scan.nextInt();
                if (coluna >= 1 && coluna <= 3) {
                    colunaValida = true;
                } else {
                    System.out.println("A coluna informada é inválida!");
                }
            }

            linha--;
            coluna--;
            if (jogoDaVelha[linha][coluna] == 'X' || jogoDaVelha[linha][coluna] == 'O') {
                System.out.println("A posição já está sendo usada, tente novamente!");
            } else { // jogada válida
                jogoDaVelha[linha][coluna] = sinal;
                jogada++;
            }

            // impressão do tabuleiro

            for (int i = 0; i < jogoDaVelha.length; i++) {
                for (int j = 0; j < jogoDaVelha[i].length; j++) {
                    System.out.print(jogoDaVelha[i][j] + " | ");
                }
                System.out.println();
            }

            // verificar se existe um ganhandor

            if ((jogoDaVelha[0][0] == 'X' && jogoDaVelha[0][1] == 'X' && jogoDaVelha[0][2] == 'X') || // linha 1
                    (jogoDaVelha[1][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[1][2] == 'X') || // linha 2
                    (jogoDaVelha[2][0] == 'X' && jogoDaVelha[2][1] == 'X' && jogoDaVelha[2][2] == 'X') || //linha3 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][0] == 'X' && jogoDaVelha[2][0] == 'X') || // coluna 1
                    (jogoDaVelha[0][1] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][1] == 'X') || // coluna 2
                    (jogoDaVelha[0][2] == 'X' && jogoDaVelha[1][2] == 'X' && jogoDaVelha[2][2] == 'X') || // coluna 3
                    (jogoDaVelha[0][0] == 'X' && jogoDaVelha[1][1] == 'X' && jogoDaVelha[2][2] == 'X')) { // diagonal
                ganhou = true;
                System.out.println("O jogador 1 é o vencedor!");
            } else if ((jogoDaVelha[0][0] == 'O' && jogoDaVelha[0][1] == 'O' && jogoDaVelha[0][2] == 'O') ||
                    (jogoDaVelha[1][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[1][2] == 'O') ||
                    (jogoDaVelha[2][0] == 'O' && jogoDaVelha[2][1] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][0] == 'O' && jogoDaVelha[2][0] == 'O') ||
                    (jogoDaVelha[0][1] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][1] == 'O') ||
                    (jogoDaVelha[0][2] == 'O' && jogoDaVelha[1][2] == 'O' && jogoDaVelha[2][2] == 'O') ||
                    (jogoDaVelha[0][0] == 'O' && jogoDaVelha[1][1] == 'O' && jogoDaVelha[2][2] == 'O')) {
                ganhou = true;
                System.out.println("O jogador 2 é o vencedor!");
            } else if (jogada > 9) {
                ganhou = true;
                System.out.println("A partida não tem vencedor...");
            }

        }
    }
}
