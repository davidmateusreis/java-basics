package com.david.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Quer saber se e o ano é bissexto ou não?");
        int ano = scan.nextInt();

        if((ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0))){
			System.out.println(ano + " é um ano Bissexto!");
		}
		else{
			System.out.println(ano + " não é um ano Bissexto!");
		}
    }
}
