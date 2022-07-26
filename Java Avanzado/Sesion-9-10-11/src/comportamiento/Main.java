package comportamiento;

// Uso el punto1 del tema-7-8-9 de Java Básico
public class Main {
    public static void main(String[] args) {
        Alumnos alumnos = new Alumnos();
        alumnos.create(new Alumno("Alan"));
        alumnos.create(new Alumno("Pedro"));
        alumnos.create(new Alumno("Juanito"));

        while (alumnos.hasMore()) {
            Alumno alumno =  alumnos.next();
            System.out.println("Nombre actual: " + alumno.getNombre());
        }

    }
}
