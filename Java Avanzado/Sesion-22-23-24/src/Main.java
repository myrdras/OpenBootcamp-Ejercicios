import Coches.Coche;
import Coches.CocheDeCombustible;
import Coches.CocheElectrico;
import Coches.CocheHibrido;

public class Main {
   /*
   //Cars need to drive
    public void drive(int distanceInMiles){
        //get miles left in car
        int miles = numGallonsInTank * milesPerGallon;

        //check that car has enough gas to drive distanceInMiles
        if (miles <= distanceInMiles){
            numGallonsInTank = numGallonsInTank - (distanceInMiles / milesPerGallon)
            System.out.println("Drove " + numGallonsInTank + " miles!");
        } else {
            System.out.println("Could not drive!");
        }
    }
    */
   public static void main(String[] args) {
      Coche combustible = new CocheDeCombustible();
      Coche electrico = new CocheElectrico();
      Coche hibrido = new CocheHibrido();

      combustible.setMarca("Volkswagen");
      combustible.setModelo("Polo 1.3 D");
      combustible.setTanqueTipo("Diesel");//42
      combustible.setYear(1989);

      electrico.setMarca("Nissan");
      electrico.setModelo("Leaf");
      electrico.setTanqueTipo("Litio-ión"); //50
      electrico.setYear(2020);

      hibrido.setMarca("Toyota");
      hibrido.setModelo("Prius Hybrid Sol");
      hibrido.setTanqueTipo("Gasolina, Litio-ión"); //43 - 25
      hibrido.setYear(2008);


      hibrido.encenderMotor();
      hibrido.encenderMotor();

      Coche car = new Coche();

      car.encenderMotor();
      car.encenderMotor();
      car.acelerar();
      car.acelerar();
      car.acelerar();
      System.out.println(car.getVelocidad());
      car.frenar();
      System.out.println(car.getVelocidad());
      car.apagarMotor();
      System.out.println(car.getVelocidad());
      car.apagarMotor();

   }

}
