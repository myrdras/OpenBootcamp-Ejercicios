package Coches;

public class Coche extends CocheBase {

   protected final int velocidadMaxima = 120;
   protected boolean motor = false;
   protected String modo = "";

   public Coche() { }

   public Coche(String marca, String modelo, String tanqueTipo, int year) {
      super(marca, modelo, tanqueTipo, year);
   }

   @Override
   public void acelerar() {
      if (motor && velocidad < velocidadMaxima) velocidad+=10;
   }
   @Override
   public void frenar() {
      if (motor && velocidad > 0) velocidad-=10;
   }

   public void apagarMotor() {
      if (motor && velocidad <= 0) {
         System.out.println(motorModo(false));
         motor = false;
         velocidad = 0;
      } else {
         System.out.println("No se puede apagar el motor. Desacelera.");
         System.out.println("Tu velocidad es: " + velocidad);
      }
   }
   public void encenderMotor() {
      System.out.println(motorModo(true));
      if (!motor)
         motor = true;
   }

   protected String motorModo(boolean op) {
      if (op) {
         modo += (motor) ? "ya estaba encendido" : "esta encendido";
      } else {
         modo += (motor) ? "esta apagado" : "ya estaba apagado";
      }
      return modo;
   }

}
