package sesion21.builders.classes;

import sesion21.builders.SmartPhoneBuilder;

public class SmartPhone extends SmartDevice {

   private final int camera;
   private final String chipset;
   private final int battery;

   public SmartPhone(SmartPhoneBuilder builder) {
      super(builder);
      this.camera = builder.camera;
      this.chipset = builder.chipset;
      this.battery = builder.battery;
   }

   public int getCamera() { return camera; }
   public String getChipset() { return chipset; }
   public int getBattery() { return battery; }

   public void mostrar() {
      super.mostrar();
      System.out.println("Camara: " + camera + "MP");
      System.out.println("Procesador: " + chipset);
      System.out.println("Bateria: " + battery + "mAh");
      System.out.println("******************************************");
   }

}
