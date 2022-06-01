package com.david.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        JogoDaVelha jogoDaVelha = new JogoDaVelha();

        System.out.println("Jogador 1 = X");
        System.out.println("Jogador 2 = O");

        boolean ganhou = false;
        char sinal;
        int linha = 0, coluna = 0;

        while (!ganhou) {

            if (jogoDaVelha.vezJogador1()) {
                System.out.println("É a vez do jogador 1. Escolha linha e coluna!");
                sinal = 'X';
            } else {
                System.out.println("É a vez do jogador 2. Escolha linha e coluna!");
                sinal = 'O';
            }

            linha = valor("Linha", scan);
            coluna = valor("Coluna", scan);

            if (!jogoDaVelha.validarJogada(linha, coluna, sinal)) {
                System.out.println("A posição já está sendo usada!");
            }

            jogoDaVelha.imprimirTabuleiro();

            if (jogoDaVelha.verificarGanhador('X')) {
                ganhou = true;
                System.out.println("O jogador 1 é o vencedor!");
            } else if (jogoDaVelha.verificarGanhador('O')) {
                ganhou = true;
                System.out.println("O jogador 2 é o vencedor!");
            } else if (jogoDaVelha.jogada > 9) {
                ganhou = true;
                System.out.println("A partida não tem vencedor...");
            }
        }
    }

    static int valor(String tipoValor, Scanner scan) {
        int valor = 0;
        boolean valorValido = false;
        while (!valorValido) {
            System.out.println("Informe a " + tipoValor + " (1, 2 ou 3)");
            valor = scan.nextInt();
            if (valor >= 1 && valor <= 3) {
                valorValido = true;
            } else {
                System.out.println("A linha informada é inválida!");
            }
        }
        valor--;
        return valor;
    }

}
