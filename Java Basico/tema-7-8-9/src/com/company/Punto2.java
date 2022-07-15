package com.company;

public class Punto2 {
    public static void main(String[] args) {
        int[][] numeros = {
                {1, 2, 3, 4},
                {10, 20, 30, 40}
        };

        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[1].length; j++) {
                System.out.println("Estoy en i = " + i + ", j = " + j);
                System.out.println("Numero: " + numeros[i][j]);
            }
        }
    }
}
