package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura atual em Farenheit?)");
        double tempF = scan.nextDouble();

        double tempC = (5 * (tempF - 32) / 9);
        System.out.println("A temperatura " + tempF + "ºF é igual a " + tempC + "ºC.");

    }
}
