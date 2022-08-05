package Coches;

public class CocheElectrico extends Coche {

   public CocheElectrico() { }

   public CocheElectrico(String marca, String modelo, int year, String tanqueTipo) {
      super(marca, modelo, year, tanqueTipo);
   }

//   public CocheElectrico(String bateria, int carga) {
//      this.bateria = bateria;
//      this.carga = carga;
//   }

   @Override
   public void acelerar() {
      if (carga > 0) {
         super.acelerar();
         carga = (carga > 10) ? carga - 10 : 0;
      } else {
         System.out.println("Ya no tengo mas bateria.");
         frenar();
      }
   }
   // La velocidad baja en 5
   @Override
   public void frenar() {
      super.frenar();
      velocidad += 5;
   }

   @Override
   protected String motorModo(boolean op) {
      modo = "con bateria de " + tanqueTipo + " ";
      return super.motorModo(op);
   }

}
