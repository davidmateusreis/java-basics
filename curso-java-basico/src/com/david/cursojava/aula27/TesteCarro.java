package com.david.cursojava.aula27;

public class TesteCarro {
    
    public static void main(String[] args) {
        
        Carro gol = new Carro();

        gol.marca = "Volkswagen";
        gol.modelo = "Gol";
        gol.numPassageiros = 5;
        gol.capCombustivel = 80;
        gol.consumoCombustivel = 0.2;

        gol.exibirAutonomia();

        double autonomia = gol.obterAutonomia();
        System.out.println("A autonomia do carro é de " + autonomia + "km.");
        System.out.println("A autonomia do carro é de " + gol.obterAutonomia() + "km.");

        double qtdCombustivel10 = gol.calcularCombustivel(10);
        double qtdCombustivel15 = gol.calcularCombustivel(15);

        System.out.println("A quantidade de combustível gasta para andar 10km é de " + qtdCombustivel10 + " e pra 15km é " + qtdCombustivel15 + ".");
        System.out.println("A quantidade de combustível gasta é " + gol.calcularCombustivel(10) + " e " + gol.calcularCombustivel(15) + ".");
    }
}
