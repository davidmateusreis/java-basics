package com.david.cursojava.aula43.labs.exer02;

public class Teste {
    
    public static void main(String[] args) {
        
        PessoaFisica p1 = new PessoaFisica();
        p1.setNome("Contribuinte 1");
        p1.setRendaBruta(1000);
        p1.setCpf("583.815.291-58");

        PessoaJuridica p2 = new PessoaJuridica();
        p2.setNome("Contribuinte 2");
        p2.setRendaBruta(5000);
        p2.setCnpj("23.878.567/0001-60");

        PessoaFisica p3 = new PessoaFisica();
        p3.setNome("Contribuinte 3");
        p3.setRendaBruta(2000);
        p3.setCpf("161.181.497-98");

        PessoaJuridica p4 = new PessoaJuridica();
        p4.setNome("Contribuinte 4");
        p4.setRendaBruta(3000);
        p4.setCnpj("62.221.922/0001-86");

        PessoaFisica p5 = new PessoaFisica();
        p5.setNome("Contribuinte 5");
        p5.setRendaBruta(3700);
        p5.setCpf("683.157.483-19");

        PessoaJuridica p6 = new PessoaJuridica();
        p6.setNome("Contribuinte 6");
        p6.setRendaBruta(4000);
        p6.setCnpj("53.506.452/0001-06");

        Contribuinte[] contribuintes = new Contribuinte[6];
        contribuintes[0] = p1;
        contribuintes[1] = p2;
        contribuintes[2] = p3;
        contribuintes[3] = p4;
        contribuintes[4] = p5;
        contribuintes[5] = p6;

        for (Contribuinte c : contribuintes) {
            System.out.println(c.toString());
        }

    }
}
