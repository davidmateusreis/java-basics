package com.david.cursojava.aula43.labs.exer03;

public class Teste {
    
    public static void main(String[] args) {
        
        Animal camelo = new Animal();
        camelo.setNome("Camelo");
        camelo.setAmbiente("Terra");
        camelo.setComprimento(150);
        camelo.setCor("Amarelo");
        camelo.setVelocidade(2.0);
        
        Peixe tubarao = new Peixe();
        tubarao.setNome("Tubarão");
        tubarao.setComprimento(300);
        tubarao.setVelocidade(1.5);

        Mamifero urso = new Mamifero();
        urso.setNome("Urso-do-Canadá");
        urso.setComprimento(180);
        urso.setCor("Vermelho");
        urso.setVelocidade(0.5);
       

        Animal[] animais = new Animal[3];
        animais[0] = camelo;
        animais[1] = tubarao;
        animais[2] = urso;

        System.out.println("Zoo:\n--------------------------------");
        for (Animal animal : animais) {
            System.out.println(animal.toString());
            System.out.println("--------------------------------");
        }
        

    }
}
