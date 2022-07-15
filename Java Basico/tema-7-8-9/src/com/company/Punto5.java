package com.company;

import java.util.ArrayList;
import java.util.LinkedList;

public class Punto5 {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Elemento A");
        lista.add("Elemento B");
        lista.add("Elemento C");
        lista.add("Elemento D");

        LinkedList<String> listaLinked = new LinkedList<>(lista);

        System.out.println("** Elementos en ArrayList **");
        for (String elem : lista) {
            System.out.println(elem);
        }

        System.out.println("** Elementos en LinkedList **");
        for (String elem : listaLinked) {
            System.out.println(elem);
        }
    }
}
