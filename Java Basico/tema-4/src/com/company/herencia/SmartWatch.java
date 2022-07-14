package com.company.herencia;

import com.company.clases.SmartDevice;

public class SmartWatch extends SmartDevice {

    private String build;

    public SmartWatch() {}

    public SmartWatch(String brand, String name, int releaseYear, int weight, double[] dimensions,
                      String os, int memory, boolean cardSlot, double displaySize, int ram,
                      String build) {
        super(brand, name, releaseYear, weight, dimensions, os, memory, cardSlot, displaySize, ram);
        this.build = build;
    }

    public void mostrar() {
        System.out.println("*****  " + brand + " " + name + "  *****");
        System.out.println("Lanzado en " + releaseYear);
        System.out.println("Peso: " + weight + "g");
        System.out.println("Dimensiones: " + dimensions[0] + " x " + dimensions[1] + " x " + dimensions[2] + "mm");
        System.out.println("OS: " + os);
        System.out.println("Almacenamiento: " + memory + "GB");
        if (cardSlot) {
            System.out.println("Slot de tarjeta: Si");
        } else {
            System.out.println("Slot de tarjeta: No");
        }
        System.out.println("Pantalla: " + displaySize + "\"");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Materiales: " + build);
        System.out.println("******************************************");
    }

}
