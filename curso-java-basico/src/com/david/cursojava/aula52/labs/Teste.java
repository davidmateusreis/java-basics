package com.david.cursojava.aula52.labs;

import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Agenda agenda = new Agenda();

        int opcao = 1;

        while (opcao != 3) {
            opcao = obterOpcaoMenu(scan);

            if (opcao == 1) { // consultar
                verificarContato(scan, agenda);
            } else if (opcao == 2) { // adicionar
                incluirContato(scan, agenda);
            }
        }
    }

    public static void incluirContato(Scanner scan, Agenda agenda) {

        try {
            System.out.println("Criando contato, informe os dados:");
            String nome = lerInformacaoString(scan, "Qual é o nome do contato?");
            String telefone = lerInformacaoString(scan, "Qual é o telefone do contato?");
            String email = lerInformacaoString(scan, "Qual é o e-mail do contato?");

            Contato contato = new Contato();
            contato.setNome(nome);
            contato.setEmail(email);
            contato.setTelefone(telefone);

            System.out.println("Contato a ser criado: ");
            System.out.println(contato);
            agenda.adicionarContato(contato);
        } catch (AgendaCheiaException e) {
            System.out.println(e.getLocalizedMessage());

            System.out.println("Contatos da agenda");
            System.out.println(agenda);
        }
    }

    public static void verificarContato(Scanner scan, Agenda agenda) {

        String nomeContato = lerInformacaoString(scan, "Qual é o nome do contato?");
        try {
            if (agenda.consutarContatoPorNome(nomeContato) >= 0) {
                System.out.println("O contato existe.");
            }
        } catch (ContatoNaoExisteException e) {
            System.out.println(e.getMessage());
        }
    }

    public static String lerInformacaoString(Scanner scan, String msg) {

        System.out.println(msg);
        String entrada = scan.nextLine();
        return entrada;
    }

    public static int obterOpcaoMenu(Scanner scan) {

        boolean entradaValida = false;
        int opcao = 3;

        while (!entradaValida) {

            System.out.println("Escolha a opção desejada:");
            System.out.println("1: Consultar contato");
            System.out.println("2: Adicionar contato");
            System.out.println("3: Sair");

            try {
                String entrada = scan.nextLine();
                opcao = Integer.parseInt(entrada);

                if (opcao == 1 || opcao == 2 || opcao == 3) {
                    entradaValida = true;
                } else {
                    throw new Exception("Opção inválida.");
                }

            } catch (Exception e) {
                System.out.println("Opção inválida, digite novamente.\n");
            }
        }

        return opcao;
    }
}
