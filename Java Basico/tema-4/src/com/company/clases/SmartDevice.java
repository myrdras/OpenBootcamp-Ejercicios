package com.company.clases;

public class SmartDevice {

    protected String brand;
    protected String name;
    protected int releaseYear;
    protected int weight;
    protected double[] dimensions;
    protected String os;
    protected int memory;
    protected boolean cardSlot;
    protected double displaySize;
    protected int ram;

    protected SmartDevice() {}

    public SmartDevice(String brand, String name, int releaseYear, int weight, double[] dimensions,
                       String os, int memory, boolean cardSlot, double displaySize, int ram) {
        this.brand = brand;
        this.name = name;
        this.releaseYear = releaseYear;
        this.weight = weight;
        this.dimensions = dimensions;
        this.os = os;
        this.memory = memory;
        this.cardSlot = cardSlot;
        this.displaySize = displaySize;
        this.ram = ram;
    }

}
