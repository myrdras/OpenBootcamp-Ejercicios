package sesion19;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main {
   public static void main(String[] args) {
      OptionsParser optionsParser = new OptionsParser(args);
      optionsParser.registerOption("usuario");
      optionsParser.registerOption("clave");

      copiaYAgregaAFichero("F:/Windows/y.txt", "Usuarios.txt",
              optionsParser.getLista());
   }

   /**
    * Para el ejercicio de implementación Args tomo el Punto9 del tema-7-8-9 de Java Básico.
    *
    * Esta función sobreescribirá el archivo de salida
    *
    * @param fileIn  Archivo que voy a copiar
    * @param fileOut Archivo de salida que tiene lo de fileIn + lista de usuarios
    * @param lista   Lista de usuarios pasados como argumentos en el main
    */
   public static void copiaYAgregaAFichero(String fileIn, String fileOut,
                                           ArrayList<HashMap<String, String>> lista) {
      try {
         InputStream in = new FileInputStream(fileIn);
         byte[] datosIn = in.readAllBytes();
         in.close();

         PrintStream out = new PrintStream(fileOut);
         out.write(datosIn);

         ArrayList<String> datos =  cargarDatos(lista);

         // Coloco los usuarios en el archivo de salida
         for (String dato : datos) {
            out.print(dato);
         }

         out.close();

      } catch (Exception e) {
         System.out.println("Excepción: " + e.getMessage());
      }

   }

   /**
    * @return ArrayList<String> de usuarios con nombre y clave
    */
   private static ArrayList<String> cargarDatos(ArrayList<HashMap<String, String>> lista) {

      ArrayList<String> usuarios = new ArrayList<>();

      // Agrego los usuarios
      for (HashMap<String, String> map : lista) {
         StringBuilder usuario = new StringBuilder();
         int valores = 0;

         // Paso los usuarios de la lista con nombre y clave a un String separados por un -
         // nombre: alan - clave: 123
         for (Map.Entry<String, String> str: map.entrySet()) {
            usuario.append(str.getKey()).append(": ").append(str.getValue());

            if (valores < map.size()) {
               usuario.append(" - ");
            }

            valores++;
         }
         usuarios.add(usuario + "\n") ;
      }

      return usuarios;
   }
}
