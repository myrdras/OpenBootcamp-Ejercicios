package refactoring;

public class SmartPhone extends SmartDevice {

    private int camera;
    private String chipset;
    private int battery;

    public SmartPhone(Builder builder) {
        super(builder);
        this.camera = builder.camera;
        this.chipset = builder.chipset;
        this.battery = builder.battery;
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
        System.out.println("Camara: " + camera + "MP");
        System.out.println("Procesador: " + chipset);
        System.out.println("Bateria: " + battery + "mAh");
        System.out.println("******************************************");
    }

    public static class Builder extends SmartDevice.Builder<Builder> {

        private int camera;
        private String chipset;
        private int battery;

        public Builder withCamera(int camera) {
            this.camera = camera;
            return this;
        }

        public Builder withChipset(String chipset) {
            this.chipset = chipset;
            return this;
        }

        public Builder withBattery(int battery) {
            this.battery = battery;
            return this;
        }

        public SmartPhone build() {
            return new SmartPhone(this);
        }

    }

}
