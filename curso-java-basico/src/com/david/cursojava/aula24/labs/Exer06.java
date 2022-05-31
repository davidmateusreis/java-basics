package com.david.cursojava.aula24.labs;

public class Exer06 {
    
    public static void main(String[] args) {
        
        Contato contato1 = new Contato();

        contato1.nome = "Nate";
        contato1.email = "nate@email.com";
        contato1.endereco = "Brazil";

        contato1.telefones = new String[4];
        contato1.telefones[0] = "(16)99987-6543";
        contato1.telefones[1] = "(16)99977-6643";
        contato1.telefones[2] = "(16)99927-6644";

        System.out.println("O nome do contato é " + contato1.nome + ", seu e-mail é " + contato1.email + ", ele mora no " + contato1.endereco + " e o número do seu celular é " + contato1.telefones[0] + ".");
    }
}
