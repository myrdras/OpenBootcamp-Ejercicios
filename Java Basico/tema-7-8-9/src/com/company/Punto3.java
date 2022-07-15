package com.company;

import java.util.Vector;

public class Punto3 {

    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);

        numeros.remove(3);
        numeros.remove(2);

        for (int i = 0; i < numeros.size(); i++) {
            System.out.println("Valor es: " + numeros.get(i) + " en " + i);
        }

    }
}
