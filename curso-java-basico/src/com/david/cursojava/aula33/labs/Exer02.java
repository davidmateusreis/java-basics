package com.david.cursojava.aula33.labs;

public class Exer02 {
    
    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente();

        conta.setNumero("90123-4");
        conta.setAgencia("0028");
        conta.setEspecial(true);
        conta.setLimiteEspecial(500);
        conta.setValorEspecialUsado(0);
        conta.setSaldo(-10);

        System.out.println("A conta de número " + conta.getNumero() + " da agência " + conta.getAgencia() + " é especial? " + conta.isEspecial() + ", tem limite especial de R$" + conta.getLimiteEspecial() + " e saldo de R$" + conta.getSaldo() + ".");

        boolean saqueEfetuado = conta.realizarSaque(10);

        if (saqueEfetuado) {
            System.out.println("O saque foi efetuado com sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
        }

        saqueEfetuado = conta.realizarSaque(500);
        System.out.println("Tentativa de saque de quinhentos reais.");
        if (saqueEfetuado) {
            System.out.println("O saque foi efetuado com sucesso!");
            conta.consultarSaldo();
        } else {
            System.out.println("Não foi possível realizar o saque. Saldo insuficiente!");
        }

        System.out.println("Depósito de quinhentos reais.");
        conta.depositar(500);
        conta.consultarSaldo();

        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando Cheque Especial.");
        } else {
            System.out.println("Não está usando Cheque Especial.");
        }

        conta.realizarSaque(600);
        conta.consultarSaldo();
        if (conta.verificarUsoChequeEspecial()) {
            System.out.println("Está usando Cheque Especial.");
        } else {
            System.out.println("Não está usando Cheque Especial.");
        }



    }
}
