package com.david.cursojava.aula36.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Qual é o curso?");
        String nome = scan.nextLine();
        
        System.out.println("Qual é o horário?");
        String horario = scan.nextLine();
        
        System.out.println("Quem é o professor?");
        String nomeProf = scan.nextLine();
        
        System.out.println("Qual é o departamento do professor?");
        String depProf = scan.nextLine();
        
        System.out.println("Qual é o endereço de e-mail do professor?");
        String emailProf = scan.nextLine();
        
        Curso curso = new Curso();
        curso.setNome(nome);
        curso.setHorario(horario);
        
        Professor professor = new Professor();
        professor.setNome(nomeProf);
        professor.setDepartamento(depProf);
        professor.setEmail(emailProf);
        
        curso.setProfessor(professor);
        
        System.out.println("------------");
        
        Aluno[] alunos = new Aluno[5];
        for (int i = 0; i < 5; i++){
            
            scan.nextLine();
            
            System.out.println("Qual é o nome do aluno " + (i + 1));
            String nomeAluno = scan.nextLine();
            
            System.out.println("Qual é a matrícula do aluno?");
            String matAluno = scan.nextLine();
            
            double[] notas = new double[4];
            
            for (int j = 0; j < 4; j++){
                System.out.println("Qual é a nota " + (j + 1) + " do aluno?");
                notas[j] = scan.nextDouble();
            }
            
            Aluno aluno = new Aluno();
            aluno.setNome(nomeAluno);
            aluno.setMatricula(matAluno);
            aluno.setNotas(notas);
            
            alunos[i] = aluno;
        }
        
        curso.setAlunos(alunos);
        
        System.out.println(curso.obterInfo());
    }
            
}

