package com.company;

import java.util.Vector;

public class Punto4 {
    public static void main(String[] args) {

        Vector<Integer> numeros = new Vector<>();
        numeros.add(1);
        System.out.println("Capacidad: " + numeros.capacity() + " - Tamaño: " + numeros.size());
        // Agrego 1000 elementos

        // El problema seria que cada vez que supere la capacidad, esta se duplicaria
        // y para ello se crearia un array por debajo cada vez que ocurra

    }
}
