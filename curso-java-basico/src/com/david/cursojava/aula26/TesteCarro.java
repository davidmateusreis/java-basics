package com.david.cursojava.aula26;

public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro palio = new Carro();

        palio.marca = "Fiat";
        palio.modelo = "Palio";
        palio.numPassageiros = 5;
        palio.capCombustivel = 70;
        palio.consumoCombustivel = 0.4;

        palio.exibirAutonomia();

        double autonomia = palio.obterAutonomia();
        System.out.println("A autonomia do carro é de " + autonomia + "km.");
        System.out.println("A autonomia do carro é de " + palio.obterAutonomia() + "km.");
    }
}
