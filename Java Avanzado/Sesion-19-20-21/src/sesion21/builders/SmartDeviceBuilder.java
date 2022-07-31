package sesion21.builders;

import sesion21.builders.classes.SmartDevice;

public abstract class SmartDeviceBuilder<T extends SmartDeviceBuilder<T>> {

   public String brand;
   public String name;
   public int releaseYear;
   public int weight;
   public double[] dimensions;
   public String os;
   public int memory;
   public boolean cardSlot;
   public double displaySize;
   public int ram;

   public SmartDeviceBuilder(String brand, String name) {
      this.brand = brand;
      this.name = name;
   }

   public abstract T getThis();

   public T withReleaseYear(int releaseYear) {
      this.releaseYear = releaseYear;
      return getThis();
   }

   public T withWeight(int weight) {
      this.weight = weight;
      return getThis();
   }

   public T withDimensions(double[] dimensions) {
      this.dimensions = dimensions;
      return getThis();
   }

   public T withOs(String os) {
      this.os = os;
      return getThis();
   }

   public T withMemory(int memory) {
      this.memory = memory;
      return getThis();
   }

   public T withCardSlot(boolean cardSlot) {
      this.cardSlot = cardSlot;
      return getThis();
   }

   public T withDisplaySize(double displaySize) {
      this.displaySize = displaySize;
      return getThis();
   }

   public T withRam(int ram) {
      this.ram = ram;
      return getThis();
   }

   public SmartDevice build() {
      return new SmartDevice(this);
   }

}