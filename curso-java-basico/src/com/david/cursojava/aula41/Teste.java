package com.david.cursojava.aula41;

public class Teste {
    
    public static void main(String[] args) {
        
        //Pessoa pessoa = new Pessoa();
        Pessoa aluno = new Aluno();
        Pessoa professor = new Professor();

        //pessoa.setEndereco("Rua 1, número 1");
        aluno.setEndereco("Rua 2, número 2");
        professor.setEndereco("Rua 3, número 3");

        //System.out.println(aluno.obterEtiquetaEndereco());
        //System.out.println(professor.obterEtiquetaEndereco());

         aluno.imprimirEtiquetaEndereco();
         professor.imprimirEtiquetaEndereco();
    }
}
