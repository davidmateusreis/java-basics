package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {
    
    public static void main(String[] args) {
        
       Scanner scan = new Scanner(System.in);
       
       System.out.println("Digite M ou F:");
       String letra = scan.next();

       if (letra.equalsIgnoreCase("M")) { //usar equals pra comparar strings
           System.out.println("Masculino");
       } else if (letra.equalsIgnoreCase("F")) {
           System.out.println("Feminino");
       } else {
           System.out.println("Sexo inválido");
       }

    }
}
