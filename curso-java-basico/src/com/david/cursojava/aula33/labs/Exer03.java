package com.david.cursojava.aula33.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        Aluno aluno = new Aluno();

        System.out.println("Qual é o nome do aluno?");
        aluno.setNome(scan.next());

        System.out.println("Qual é o nome do curso?");
        aluno.setNomeCurso(scan.next());;

        System.out.println("Qual é a matrícula?");
        aluno.setMatricula(scan.next());;

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            System.out.println("Informe o nome da disciplina " + (i + 1) + ".");
            aluno.setNomeDisciplinaPos(i, scan.next());
        }

        for (int i = 0; i < aluno.getNotasDisciplinas().length; i++) {
            System.out.println("Obtendo as notas da disciplina " + aluno.getNomeDisciplinas()[i] + ".");
            for (int j = 0; j < aluno.getNotasDisciplinas()[i].length; j++) {
                System.out.println("Informe a nota " + (j + 1) + ".");
                aluno.setNotaPosIJ(i, j, scan.nextDouble());
            }
        }

        aluno.mostrarInfo();

        for (int i = 0; i < aluno.getNomeDisciplinas().length; i++) {
            if (aluno.verificarAprovado(i)) {
                System.out.println("O aluno foi aprovado na disciplina " + aluno.getNomeDisciplinas()[i] + ".");
            } else {
                System.out.println("O aluno foi reprovado na disciplina " + aluno.getNomeDisciplinas()[i] + ".");
            }
        }
    }
}
