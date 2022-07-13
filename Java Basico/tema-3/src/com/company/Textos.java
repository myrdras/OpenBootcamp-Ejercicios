package com.company;

public class Textos {
    public static void main(String[] args) {
        String[] nombres = {"Pepe", "Juanito", "Roberta", "Alan", "Pedro", "Flor"};
        String juntos = "";

        for (String nom : nombres) {
            juntos += nom + " ";
        }

        System.out.println(juntos);
    }
}
