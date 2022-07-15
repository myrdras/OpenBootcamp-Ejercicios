package com.company;

public class Punto0 {

    public static void main(String[] args) {
        String cadenaReverse = reverse("Cadena de Texto");
        System.out.println(cadenaReverse);
    }

    public static String reverse(String texto) {
        StringBuilder reverse = new StringBuilder();
        for (int i = texto.length(); i > 0; i--) {
            reverse.append(texto.charAt(i - 1));
        }
        return reverse.toString();
    }

}
