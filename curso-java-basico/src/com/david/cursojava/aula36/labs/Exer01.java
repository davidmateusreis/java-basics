package com.david.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer01 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o nome da agenda?");
        String nome = scan.nextLine();

        Agenda agenda = new Agenda(nome);

        Contato[] contatos = new Contato[3];
        for (int i = 0; i < 3; i++) {
            System.out.println("Quais são as informações do contato " + (i + 1) + "?");

            Contato c = new Contato();

            System.out.println("Informe o nome:");
            nome = scan.nextLine();
            c.setNome(nome);

            System.out.println("Informe o número do telefone:");
            String telefone = scan.nextLine();
            c.setTelefone(telefone);

            System.out.println("Informe o endereço de e-mail:");
            String email = scan.nextLine();
            c.setEmail(email);

            contatos[i] = c;
        }

        agenda.setContatos(contatos);
        if (agenda != null) {
            System.out.println(agenda.obterInfo());
        }
    }
}
