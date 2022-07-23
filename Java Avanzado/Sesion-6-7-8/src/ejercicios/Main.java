package ejercicios;

public class Main {
    public static void main(String[] args) {
        System.out.println("Si ves el mismo valor, entonces singleton fue reusado.\n" +
                "Si ves distintos valores, entonces 2 singletons fueron creados \n\n" +
                "RESULTADO:\n");
        Singleton singleton = Singleton.getInstancia("Soy un singleton");
        Singleton otroSingleton = Singleton.getInstancia("Otro singleton");
        System.out.println(singleton.valor);
        System.out.println(otroSingleton.valor);
    }
}
