package com.david.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer14 {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual é o tamanho do arquivo?");
        double tamArquivo = scan.nextDouble();
        System.out.println("Qual é a velocidade da internet?");
        double velInternet = scan.nextDouble();

        double tempDownload = tamArquivo / velInternet; 
        
        System.out.println("O tempo aproximado de download é " + tempDownload + " minutos.");
    }
}
