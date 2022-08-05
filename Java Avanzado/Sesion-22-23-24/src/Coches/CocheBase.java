package Coches;

public abstract class CocheBase {

   String marca;
   String modelo;
   String tanqueTipo;
   int year;
   int velocidad = 0;
   int carga = 100;

   public CocheBase() { }

   public CocheBase(String marca, String modelo, String tanqueTipo, int year) {
      this.marca = marca;
      this.modelo = modelo;
      this.tanqueTipo = tanqueTipo;
      this.year = year;
   }

   public void setMarca(String marca) {
      this.marca = marca;
   }
   public void setModelo(String modelo) {
      this.modelo = modelo;
   }
   public void setTanqueTipo(String tanqueTipo) {
      this.tanqueTipo = tanqueTipo;
   }
   public void setYear(int year) {
      this.year = year;
   }

   public String getModelo() {
      return modelo;
   }
   public String getMarca() {
      return marca;
   }
   public String getTanqueTipo() {
      return tanqueTipo;
   }
   public int getVelocidad() {
      return velocidad;
   }
   public int getYear() {
      return year;
   }

   abstract void acelerar();
   abstract void frenar();

}
