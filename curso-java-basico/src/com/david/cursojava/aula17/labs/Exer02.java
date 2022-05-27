package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer02 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        boolean infoValidas = false; //flag
        String usuario;
        String senha;

        do {
            System.out.println("Qual é o usuário?");
            usuario = scan.next();

            System.out.println("Qual é a senha?");
            senha = scan.next();

            if (usuario.equalsIgnoreCase(senha)) {
                infoValidas = false; //flag
                System.out.println("A senha não pode ser igual ao nome de usuário, informe novamente.");
            } else {
                infoValidas = true; //flag
                System.out.println("A senha e usuário são válidos.");
            }

        } while (!infoValidas); 
    }
}
