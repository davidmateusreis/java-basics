package com.david.cursojava.aula36;

public class Teste {

    public static void main(String[] args) {

        Contato contato = new Contato();

        contato.setNome("Ana");
        // contato.setEndereco("Rua 8");
        // contato.setTelefone(" 42 62264-6443");

        // criar objeto endereço, relacionamento tem um endereço
        Endereco end = new Endereco();

        end.setNomeRua("Rua 9");
        end.setNumero("42");
        end.setComplemento("Apto");
        end.setCep("24428-000");
        end.setCidade("Porto");
        end.setEstado("Rio");

        contato.setEndereco(end);

        // criar objeto telefone, relacionamento tem um telefone
        Telefone tel = new Telefone();

        tel.setTipo("Celular");
        tel.setDdd("37");
        tel.setNumero("99454-7788");

        Telefone tel2 = new Telefone();

        tel2.setTipo("Fixo");
        tel2.setDdd("34");
        tel2.setNumero("99212-7744");

        Telefone[] telefones = new Telefone[2];

        telefones[0] = tel;
        telefones[1] = tel2;

        //contato.setTelefone(tel);
        contato.setTelefones(telefones);

        System.out.println(contato.getNome());
        //System.out.println(contato.getTelefone());

        if (contato != null && contato.getEndereco() != null) {
            System.out.println(contato.getEndereco().getCidade());
        }

        /*if (contato != null && contato.getTelefone() != null) {
            System.out.println(contato.getTelefone().getDdd() + contato.getTelefone().getNumero());
        }*/

        if (contato != null && contato.getTelefones() != null) {
            for (Telefone t : contato.getTelefones()) {
                System.out.println(t.getDdd() + t.getNumero());
            }
        }
    }
}
