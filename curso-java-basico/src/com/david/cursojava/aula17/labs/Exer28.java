package com.david.cursojava.aula17.labs;

import java.util.Scanner;

public class Exer28 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Descubra se o número é primo.");
        int n = scan.nextInt();

        boolean primo = true;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                System.out.println("O número informado não é primo pois, ele é divisíve por " + i + ".");
                primo = false;
            }
        }
        if (primo) {
            System.out.println("O número informado é primo.");
        }
    }
}
