package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é a temperatura atual em Celsius?");
        double tempC = scan.nextDouble();

        double tempF = (tempC * 1.8) + 32;
        System.out.println("A temperatura " + tempC + "ºC é igual a " + tempF + "ºF.");
    }
}
