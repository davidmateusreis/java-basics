package com.david.cursojava.aula26;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + "km.");
    }

    double obterAutonomia () { //método com retorno
        System.out.println("O método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }
}
