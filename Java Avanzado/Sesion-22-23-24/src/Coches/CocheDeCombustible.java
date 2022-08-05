package Coches;

public class CocheDeCombustible extends Coche {

   private String combustible;
   private int litros;

   public CocheDeCombustible() { }

   public CocheDeCombustible(String marca, String modelo, int year, String tanqueTipo) {
      super(marca, modelo, year, tanqueTipo);
   }

//   public CocheDeCombustible(String combustible, int litros) {
//      this.combustible = combustible;
//      this.litros = litros;
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
   // La velocidad baja en 15
   @Override
   public void frenar() {
      super.frenar();
      velocidad -= 5;
   }

   @Override
   protected String motorModo(boolean op) {
      modo = "con " + tanqueTipo + " ";
      return super.motorModo(op);
   }

}
