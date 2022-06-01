package com.david.cursojava.aula34;

public class TesteCalculadora {
    
    static int ResultadoSoma;
    public static void main(String[] args) {

        ResultadoSoma = MinhaCalculadora.soma(1, 2);

        soma2Valores(1, 2);
    }

    static int soma2Valores(int num1, int num2) {
        return MinhaCalculadora.soma(num1, num2);
    }
}
