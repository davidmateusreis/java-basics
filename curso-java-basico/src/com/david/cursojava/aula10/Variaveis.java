package com.david.cursojava.aula10;

public class Variaveis {
    
    public static void main(String[] args) {
        // Convenção Java
        int idade = 20;
        String nome = "David";
        String nomeDoMeuCachorro = "Setsuna";
        String ano2014;
        // Aceito mas não utilizado
        int _idade;
        int $idade;
        // Não é convenção Java
        String nome_do_meu_cachorro;
        String NomeDoMeuCachorro;
        String nomeDoMeucachorro;

        idade = 25;

        System.out.println("A idade é " + idade);
        System.out.println("O nome é " + nome);

        // Má prática
        int a = 10;
        String b = "David";


    }
}
