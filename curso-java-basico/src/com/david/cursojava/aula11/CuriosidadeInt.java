package com.david.cursojava.aula11;

public class CuriosidadeInt {
    
    public static void main(String[] args) {
        
        int var1 = 2147483647;
        int var2 = 1;

        System.out.println(var1 + var2);

        //2147483648
        //-2147483647

        double d1 = 123.4;
        //mesmo valor que d1, mas em notação científica
        double d2 = 1.23e2;

        float f1 = 123.4f;

        int decVal = 26;
        int hexVal = 0x1a;
        int octVal = 032;
        int binVal = 0b11010; //JDK 7
    }
}
