package Coches;

public class CocheHibrido extends Coche {

   private String combustible;
   private String bateria;
   private int litros;
   private int carga;

   public CocheHibrido() { }

   public CocheHibrido(String marca, String modelo, int year, String tanqueTipo) {
      super(marca, modelo, year, tanqueTipo);
   }

//   public CocheHibrido(String combustible, String bateria, int litros, int carga) {
//      this.combustible = combustible;
//      this.bateria = bateria;
//      this.litros = litros;
//      this.carga = carga;
//   }

   @Override
   public void acelerar() {
      if (litros > 0) {
         litros = (litros > 5) ? litros - 5 : 0;
         super.acelerar();
      } else {
         System.out.println("Ya no tengo mas bateria.");
         frenar();
      }
   }
   // La velocidad baja en 7
   @Override
   public void frenar() {
      super.frenar();
      velocidad += 3;
   }

   @Override
   protected String motorModo(boolean op) {
      modo = "con " + combustible + " y bateria de " + bateria + " ";
      return super.motorModo(op);
   }

}
