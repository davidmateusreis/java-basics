package com.david.cursojava.aula17;

public class LoopFor {
    
    public static void main(String[] args) {
        
        for (int i = 0; i < 5; i++) {
            System.out.println("O valor de i é " + i + ".");
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println("O valor de i é " + i + ".");
        }
        //System.out.println(i);
        for (int i = 0, j = 10; i < j; i++, j--) {
            System.out.println("O valor de i é " + i + " e o valor de j é " + j + ".");
        }

        int count = 0;
        for ( ; count < 10 ; ) {
            System.out.println("O valor de count é " + count + ".");
            count += 2;
        }
        for (int cont = 0; cont < 10; cont += 2) {
            System.out.println("O valor de cont é " + cont + ".");
        }

        for (;; ); //loop infinito

        int soma = 0;
        for (int i = 1; i < 5; soma += i++);
        System.out.println("O valor da soma é " + soma + ".");

        for (int i = 0; i < 5; i++) {
            System.out.println("O valor de i é " + i + ".");
            System.out.println("O valor de i é " );
        }
    }
}
