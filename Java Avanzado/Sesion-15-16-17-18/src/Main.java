import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        // Arithmetic exception
        // tratando de hacer una división entre dos números, siendo el que divide 0
        try {
            System.out.println( 4 / 0 );
        } catch (ArithmeticException e) {
            System.out.println("Excepción aritmética : " + e.getMessage());
        }

        // ArrayIndexOutOfBounds
        // con un array de 6 elementos, tratando de alcanzar el noveno elemento
        try {
            int[] num = {1, 2, 3, 4, 5, 6};
            System.out.println(num[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Excepción fuera del array : " + e.getMessage());
        }

        // FileNotFound
        // tratando de acceder a un fichero que no existe
        try {
            File archivo = new File("C://no_existo.txt");
            FileReader fr = new FileReader(archivo);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
