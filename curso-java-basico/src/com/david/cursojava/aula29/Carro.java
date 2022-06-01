package com.david.cursojava.aula29;

public class Carro {
    
    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    double consumoCombustivel;

    Carro() {
        System.out.println("A classe Carro foi instânciada.");
        numPassageiros = 4;
    }

    Carro(String marca_, String modelo_, int numPassageiros_, double capCombustivel_, double consumoCombustivel_) {
        marca = marca_;
        modelo = modelo_;
        numPassageiros = numPassageiros_;
        capCombustivel = capCombustivel_;
        consumoCombustivel = consumoCombustivel_;
    }

    void exibirAutonomia() {
        System.out.println("A autonomia do carro é de " + capCombustivel * consumoCombustivel + "km.");
    }

    double obterAutonomia () {
        System.out.println("O método obterAutonomia foi chamado.");
        return capCombustivel * consumoCombustivel;
    }

    double calcularCombustivel (double km) { //método com retorno de parâmetro
        double qtdCombustivel = km / consumoCombustivel;
        return qtdCombustivel;
    }
}
