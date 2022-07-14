package com.company.herencia;

import com.company.clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    private int camera;
    private String chipset;
    private int battery;

    public SmartPhone() {}

    public SmartPhone(String brand, String name, int releaseYear, int weight, double[] dimensions,
                      String os, int memory, boolean cardSlot, double displaySize, int ram,
                      int camera, String chipset, int battery) {
        super(brand, name, releaseYear, weight, dimensions, os, memory, cardSlot, displaySize, ram);
        this.camera = camera;
        this.chipset = chipset;
        this.battery = battery;
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
        System.out.println("Camara: " + camera + "MP");
        System.out.println("Procesador: " + chipset);
        System.out.println("Bateria: " + battery + "mAh");
        System.out.println("******************************************");
    }

}
