package com.company;

public class TiposDeDatos {
    public static void main(String[] args) {

        // 1. numericos

        // 1.1. enteros
        byte varByte = 5;
        short varShort = 10;
        int varInt = 30;
        long varLong = 100;

        // 1.2. decimales
        float varFloat = 5.5f;
        double varDouble = 10.5d;

        // 2. booleano
        boolean varBoolean = false;

        // 3. texto
        char varChar = 'a';
        String varString = "Hola Mundo";

        // Imprimo
        System.out.println("Byte: " + varByte);
        System.out.println("Short: " + varShort);
        System.out.println("Int: " + varInt);
        System.out.println("Long: " + varLong);
        System.out.println("Float: " + varFloat);
        System.out.println("Double: " + varDouble);
        System.out.println("Boolean: " + varBoolean);
        System.out.println("Char: " + varChar);
        System.out.println("String: " + varString);

    }
}
