package com.david.cursojava.aula43;

public class Teste {
    
    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();

        aluno.setCurso("Java");
        double[] notas = {10, 9, 8, 7};
        aluno.setNotas(notas);

        System.out.println(aluno);

        String s1 = "David";
        String s2 = "DAVID";

        System.out.println(s1.equalsIgnoreCase(s2));

        Aluno aluno2 = new Aluno();

        aluno2.setCurso("Spring");
        double[] notas2 = {7, 9, 8, 8};
        aluno2.setNotas(notas2);

        System.out.println(aluno.equals(aluno2));

    }
}
