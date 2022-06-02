package com.david.cursojava.aula43.labs.exer01;

public class Teste {

    public static void main(String[] args) {

        System.out.println("*** Teste ContaBancaria ***");

        ContaBancaria contaSimples = new ContaBancaria();
        contaSimples.setNomeCliente("Cliente Conta Simples");
        contaSimples.setNumConta("10789-8");

        contaSimples.depositar(100);

        realizarSaque(contaSimples, 50);

        realizarSaque(contaSimples, 70);

        System.out.println(contaSimples);

        System.out.println("*** Teste ContaPoupanca ***");

        ContaPoupanca ContaPoupanca = new ContaPoupanca();
        ContaPoupanca.setNomeCliente("Cliente Conta Poupança");
        ContaPoupanca.setNumConta("10134-0");
        ContaPoupanca.setDiaRendimento(2);

        ContaPoupanca.depositar(100);

        realizarSaque(ContaPoupanca, 50);

        realizarSaque(ContaPoupanca, 70);

        if (ContaPoupanca.calcularNovoSaldo(0.5)) {
            System.out.println("Seu novo saldo é de R$ " + ContaPoupanca.getSaldo() + " após o rendimento.");
        } else {
            System.out.println("O aniversário da sua conta não é no dia de hoje.");
        }

        System.out.println(ContaPoupanca);

        System.out.println("*** Teste ContaEspecial ***");

        ContaEspecial contaEspecial = new ContaEspecial();
        contaEspecial.setNomeCliente("Cliente Conta Especial");
        contaEspecial.setNumConta("10345-6");
        contaEspecial.setLimite(50);

        contaEspecial.depositar(100);

        realizarSaque(contaEspecial, 50);

        realizarSaque(contaEspecial, 70);
    }

    private static void realizarSaque(ContaBancaria conta, double valor) {
        if (conta.sacar(valor)) {
            System.out.println("Saque efetuado com sucesso. Seu novo saldo é de R$" + conta.getSaldo() + ".");
        } else {
            System.out.println(
                    "Saldo insuficiente para saque de R$" + valor + "; O saldo é de R$" + conta.getSaldo() + ".");
        }
    }
}
