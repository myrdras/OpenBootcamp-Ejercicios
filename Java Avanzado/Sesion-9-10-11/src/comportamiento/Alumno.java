package comportamiento;

public class Alumno {
    private String nombre;

    private Alumno() {}

    public Alumno(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}
