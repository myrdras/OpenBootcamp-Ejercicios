package sesion21.builders.classes;

import sesion21.builders.SmartDeviceBuilder;

public class SmartDevice {

   private final String brand;
   private final String name;
   private final int releaseYear;
   private final int weight;
   private final double[] dimensions;
   private final String os;
   private final int memory;
   private final boolean cardSlot;
   private final double displaySize;
   private final int ram;

   public SmartDevice(SmartDeviceBuilder<?> builder) {
      this.brand = builder.brand;
      this.name = builder.name;
      this.releaseYear = builder.releaseYear;
      this.weight = builder.weight;
      this.dimensions = builder.dimensions;
      this.os = builder.os;
      this.memory = builder.memory;
      this.cardSlot = builder.cardSlot;
      this.displaySize = builder.displaySize;
      this.ram = builder.ram;
   }

   public String getBrand() { return brand; }
   public String getName() { return name; }
   public int getReleaseYear() { return releaseYear; }
   public int getWeight() { return weight; }
   public double[] getDimensions() { return dimensions; }
   public String getOs() { return os; }
   public int getMemory() { return memory; }
   public boolean isCardSlot() { return cardSlot; }
   public double getDisplaySize() { return displaySize; }
   public int getRam() { return ram; }

   public void mostrar() {
      System.out.println("*****  " + brand + " " + name + "  *****");
      System.out.println("Lanzado en " + releaseYear);
      System.out.println("Peso: " + weight + "g");
      System.out.println("Dimensiones: " + dimensions[0] + " x " + dimensions[1]
              + " x " + dimensions[2] + "mm");
      System.out.println("OS: " + os);
      System.out.println("Almacenamiento: " + memory + "GB");
      if (cardSlot) {
         System.out.println("Slot de tarjeta: Si");
      } else {
         System.out.println("Slot de tarjeta: No");
      }
      System.out.println("Pantalla: " + displaySize + "\"");
      System.out.println("RAM: " + ram + "GB");
   }

}
