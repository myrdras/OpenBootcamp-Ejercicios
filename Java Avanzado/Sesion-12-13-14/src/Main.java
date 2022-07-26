import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int []iNumeros = { 1, 2, 3, 4, 5 };

        // copiaYAgregaAFichero("F:/Windows/y.txt", "Usuarios.txt");
    }

    /**
     * Estas son las dos funciones limpias
     */
    public static int sumarNumeros(int []numeros) {
        return Arrays.stream(numeros).reduce(0, (a, b) -> a + b);
    }

    public static int sumarInfinitamente(int ...numeros) {
        int resultado = 0;
        for (int numero : numeros) {
            resultado += numero;
        }
        return resultado;
    }

    /**
     * Para el ejercicio de comentarios tomo el Punto9 del tema-7-8-9 de Java Básico
     *
     * Esta función sobreescribirá el archivo de salida
     *
     * @param fileIn  Archivo que voy a copiar
     * @param fileOut Archivo de salida que tiene lo de fileIn + 3 usuarios
     */
    public static void copiaYAgregaAFichero(String fileIn, String fileOut) {
        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datosIn = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datosIn);

            String[] datos =  cargarDatos();

            // Coloco los usuarios en el archivo de salida
            for (String dato : datos) {
                out.print(dato);
            }

            out.close();

        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }

    /**
     * @return String[] 3 usuarios con nombre y clave
     */
    private static String[] cargarDatos() {
        ArrayList<HashMap<String, String>> lista = new ArrayList<>();

        String[] usuarios = {"", "", ""};
        Scanner sc = new Scanner(System.in);

        // Leo los usuarios
        // Los guardo en una lista con nombre y clave
        for (int i = 0; i < 3; i++) {
            HashMap<String, String> mapa = new HashMap<>();
            System.out.println("Agrega " + (3-i) + " usuarios");

            System.out.print("Nombre: ");
            mapa.put("Usuario", sc.next());

            System.out.print("Clave: ");
            mapa.put("Clave", sc.next());

            lista.add(mapa);
        }

        // Agrego los usuarios
        int pos = 0;
        for (HashMap<String, String> map : lista) {
            int valores = 1;

            // Paso los usuarios de la lista con nombre y clave a un String separados por un -
            // nombre: alan - clave: 123
            for (Map.Entry<String, String> str: map.entrySet()) {
                usuarios[pos] += str.getKey() + ": " + str.getValue();

                if (valores < 2) {
                    usuarios[pos] += " - ";
                }

                valores++;
            }
            usuarios[pos] += "\n";
            pos++;
        }

        return usuarios;
    }

}
