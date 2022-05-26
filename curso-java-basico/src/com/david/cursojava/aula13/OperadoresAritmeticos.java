package com.david.cursojava.aula13;

public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        
        int resultado = 1 + 2;
        System.out.println(resultado);

        resultado = resultado - 1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);

        resultado = resultado % 7;
        System.out.println(resultado);

        String primeirNome = "Esta é";
        String segundoNome = " uma String concatenada.";
        String terceiroNome = primeirNome + segundoNome;
        System.out.println(terceiroNome);
        
        resultado = resultado + 1;
        System.out.println(resultado);

        resultado++;
        System.out.println(resultado);

        //5
        System.out.println(resultado++); //incremente depois de imprimir
        /*mesma coisa que
        System.out.println(resultado);
        resultado = resultado + 1;
        resultado += 1;*/

        System.out.println(++resultado); // incrementa antes de imprimir
        /*mesma coisa que
        resultado = resultado + 1;
        resultado += 1;
        System.out.println(resultado);*/

        resultado--;
        System.out.println(resultado);

        System.out.println(resultado--);
        System.out.println(--resultado);

        

    }
}
