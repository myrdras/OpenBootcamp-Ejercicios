package comportamiento;

import java.util.ArrayList;

public class Alumnos implements AlumnoIterator {
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private int pos = 0;

    public void create(Alumno alumno) {
        alumnos.add(alumno);
    }

    @Override
    public boolean hasMore() {
        return pos < alumnos.size();
    }

    @Override
    public void reset() {
        pos = 0;
    }

    @Override
    public Alumno next() {
        Alumno alumno = alumnos.get(pos);
        pos++;
        return alumno;
    }
}
