package com.david.cursojava.aula25;

public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro fiesta = new Carro();

        fiesta.marca = "Ford";
        fiesta.modelo = "Fiesta";
        fiesta.numPassageiros = 5;
        fiesta.capCombustivel = 80;
        fiesta.consumoCombustivel = 0.3;

        fiesta.exibirAutonomia(); //método
    }
}
