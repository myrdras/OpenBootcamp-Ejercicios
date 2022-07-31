package sesion21.builders.classes;

import sesion21.builders.SmartWatchBuilder;

public class SmartWatch extends SmartDevice {

   private final String build;

   public SmartWatch(SmartWatchBuilder builder) {
      super(builder);
      this.build = builder.build;
   }

   public String getBuild() { return build; }

   public void mostrar() {
      super.mostrar();
      System.out.println("Materiales: " + build);
      System.out.println("******************************************");
   }

}
