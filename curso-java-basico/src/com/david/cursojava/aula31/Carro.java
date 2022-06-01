package com.david.cursojava.aula31;

public class Carro {
    
    public String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private public double consumoCombustivel;

    public void exibirAutonomia() {
        System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + "km.");
    }

    public double obterAutonomia () {
        System.out.println("O método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    private double divideKmPorConsumoCombustivel(double km) {
        return km / consumoCombustivel;
    }

    public double calcularCombustivel (double km) { 
        return this.divideKmPorConsumoCombustivel(km);
    }
}
