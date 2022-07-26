package refactoring;

// Uso el ejercicio del tema4 de Java Básico
public class Main {
    public static void main(String[] args) {

        SmartPhone celu1 = SmartPhone.builder()
                .withBrand("Huawei").withName("Nova 10 Pro").withReleaseYear(2022)
                .withWeight(191).withDimensions(new double[]{164.2, 74.5, 7.9})
                .withOs("HarmonyOS 2.0").withMemory(256).withCardSlot(false)
                .withDisplaySize(6.78).withRam(8).withCamera(50)
                .withChipset("Snapdragon 778G 4G").withBattery(4500)
                .build();

        SmartWatch reloj1 = SmartWatch.builder()
                .withBrand("Huawei").withName("Watch 3 Pro").withReleaseYear(2021)
                .withWeight(63).withDimensions(new double[]{48, 49.6, 14})
                .withOs("HarmonyOS 2.0").withMemory(16).withCardSlot(false)
                .withDisplaySize(1.43).withRam(2)
                .withBuild("Frente de vidrio, posterior de cerámica, caja de titanio")
                .build();

        SmartPhone celu2 = SmartPhone.builder()
                .withBrand("Samsung Galaxy").withName("S22").withReleaseYear(2022)
                .withWeight(167).withDimensions(new double[]{146, 70.6, 7.6})
                .withOs("Android 12").withMemory(256).withCardSlot(false)
                .withDisplaySize(6.1).withRam(8).withCamera(50)
                .withChipset("Snapdragon 8 Gen 1 3GHz").withBattery(3700)
                .build();

        SmartWatch reloj2 = SmartWatch.builder()
                .withBrand("Samsung Galaxy").withName("Watch 3").withReleaseYear(2020)
                .withWeight(54).withDimensions(new double[]{45, 46.2, 11.1})
                .withOs("Tizen Wearable OS 5.5").withMemory(8).withCardSlot(false)
                .withDisplaySize(1.4).withRam(1)
                .withBuild("Frente de vidrio, cuerpo de acero inoxidable o titanio")
                .build();

        celu1.mostrar();
        reloj1.mostrar();
        celu2.mostrar();
        reloj2.mostrar();

    }
}
