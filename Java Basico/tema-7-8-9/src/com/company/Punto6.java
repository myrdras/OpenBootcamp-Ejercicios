package com.company;

import java.util.ArrayList;

public class Punto6 {
    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numeros.add(i+1);
        }

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) % 2 == 0) {
                numeros.remove(i);
            }
        }

        for (Integer num : numeros) {
            System.out.println("Numero: " + num);
        }

    }
}
