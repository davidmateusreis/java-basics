package com.david.cursojava.aula27.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Qual é o nome do aluno?");
        aluno.nome = scan.next();

        System.out.println("Qual é o nome do curso?");
        aluno.nomeCurso = scan.next();

        System.out.println("Qual é a matrícula?");
        aluno.matricula = scan.next();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            System.out.println("Informe o nome da disciplina " + (i + 1) + ".");
            aluno.nomeDisciplinas[i] = scan.next();
        }

        for (int i = 0; i < aluno.notasDisciplinas.length; i++) {
            System.out.println("Obtendo as notas da disciplina " + aluno.nomeDisciplinas[i] + ".");
            for (int j = 0; j < aluno.notasDisciplinas[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + ".");
                aluno.notasDisciplinas[i][j] = scan.nextDouble();
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.nomeDisciplinas.length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("O aluno foi aprovado na disciplina " + aluno.nomeDisciplinas[i] + ".");
            } else {
                System.out.println("O aluno foi reprovado na disciplina " + aluno.nomeDisciplinas[i] + ".");
            }
        }

    }
}
