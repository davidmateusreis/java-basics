package com.david.cursojava.aula25;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    void exibirAutonomia() { //método simples, sem retorno ou parâmetro
        System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + "km.");
    }
}
