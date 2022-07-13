package com.company;

public class AgregoIVA {
    public static void main(String[] args) {
        double precio = 3000d;
        System.out.println("El precio con el IVA es: " + precioConIVA(precio));

    }
    public static double precioConIVA(double precio) {
        double iva = 0.21;
        return precio + (precio * iva);
    }
}
