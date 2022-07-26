package refactoring;

public class SmartWatch extends SmartDevice {

    private String build;

    public SmartWatch(Builder builder) {
        super(builder);
        this.build = builder.build;
    }

    public static Builder builder() {
        return new Builder();
    }

    public void mostrar() {
        System.out.println("*****  " + brand + " " + name + "  *****");
        System.out.println("Lanzado en " + releaseYear);
        System.out.println("Peso: " + weight + "g");
        System.out.println("Dimensiones: " + dimensions[0] + " x " + dimensions[1] + " x " + dimensions[2] + "mm");
        System.out.println("OS: " + os);
        System.out.println("Almacenamiento: " + memory + "GB");
        if (cardSlot) {
            System.out.println("Slot de tarjeta: Si");
        } else {
            System.out.println("Slot de tarjeta: No");
        }
        System.out.println("Pantalla: " + displaySize + "\"");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Materiales: " + build);
        System.out.println("******************************************");
    }

    public static class Builder extends SmartDevice.Builder<Builder> {

        private String build;

        public Builder withBuild(String build) {
            this.build = build;
            return this;
        }

        public SmartWatch build() {
            return new SmartWatch(this);
        }

    }

}
