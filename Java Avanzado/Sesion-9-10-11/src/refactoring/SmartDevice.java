package refactoring;

public class SmartDevice {

    protected String brand;
    protected String name;
    protected int releaseYear;
    protected int weight;
    protected double[] dimensions;
    protected String os;
    protected int memory;
    protected boolean cardSlot;
    protected double displaySize;
    protected int ram;

    protected SmartDevice(final Builder<?> builder) {
        this.brand = builder.brand;
        this.name = builder.name;
        this.releaseYear = builder.releaseYear;
        this.weight = builder.weight;
        this.dimensions = builder.dimensions;
        this.os = builder.os;
        this.memory = builder.memory;
        this.cardSlot = builder.cardSlot;
        this.displaySize = builder.displaySize;
        this.ram = builder.ram;
    }

    public static class Builder<T extends Builder<T>> {

        private String brand;
        private String name;
        private int releaseYear;
        private int weight;
        private double[] dimensions;
        private String os;
        private int memory;
        private boolean cardSlot;
        private double displaySize;
        private int ram;

        public T withBrand(String brand) {
            this.brand = brand;
            return (T)this;
        }

        public T withName(String name) {
            this.name = name;
            return (T)this;
        }

        public T withReleaseYear(int releaseYear) {
            this.releaseYear = releaseYear;
            return (T)this;
        }

        public T withWeight(int weight) {
            this.weight = weight;
            return (T)this;
        }

        public T withDimensions(double[] dimensions) {
            this.dimensions = dimensions;
            return (T)this;
        }

        public T withOs(String os) {
            this.os = os;
            return (T)this;
        }

        public T withMemory(int memory) {
            this.memory = memory;
            return (T)this;
        }

        public T withCardSlot(boolean cardSlot) {
            this.cardSlot = cardSlot;
            return (T)this;
        }

        public T withDisplaySize(double displaySize) {
            this.displaySize = displaySize;
            return (T)this;
        }

        public T withRam(int ram) {
            this.ram = ram;
            return (T)this;
        }

        public SmartDevice build() {
            return new SmartDevice(this);
        }

    }

}
