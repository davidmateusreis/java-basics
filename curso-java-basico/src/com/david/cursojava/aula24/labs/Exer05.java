package com.david.cursojava.aula24.labs;

public class Exer05 {
    
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();

        conta.numero = "90123-4";
        conta.agencia = "0028";
        conta.especial = true;
        conta.limiteEspecial = 800;
        conta.saldo = 11.786;

        System.out.println("A conta de número " + conta.numero + " da agência " + conta.agencia + " é especial? " + conta.especial + ", tem limite especial de R$" + conta.limiteEspecial + " e saldo de R$" + conta.saldo + ".");
    }
}
