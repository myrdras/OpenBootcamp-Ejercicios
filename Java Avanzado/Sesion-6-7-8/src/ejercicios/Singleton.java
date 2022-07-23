package ejercicios;

public class Singleton {

    private static Singleton instancia;
    public String valor;

    private Singleton(String valor) {
        // El código emula una iniciación lenta
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.valor = valor;
    }

    public static Singleton getInstancia(String valor) {
        if (instancia == null) {
            instancia = new Singleton(valor);
        }
        return instancia;
    }

}
