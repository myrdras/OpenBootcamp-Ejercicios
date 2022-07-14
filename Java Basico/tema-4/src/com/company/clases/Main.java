package com.company.clases;

import com.company.herencia.SmartPhone;
import com.company.herencia.SmartWatch;

public class Main {
    public static void main(String[] args) {

        SmartPhone celu1 = new SmartPhone("Huawei", "Nova 10 Pro", 2022, 191, new double[]{164.2, 74.5, 7.9},
                "HarmonyOS 2.0", 256, false, 6.78, 8, 50, "Snapdragon 778G 4G", 4500);
        SmartWatch reloj1 = new SmartWatch("Huawei", "Watch 3 Pro", 2021, 63, new double[]{48, 49.6, 14},
                "HarmonyOS 2.0", 16, false, 1.43, 2, "Frente de vidrio, posterior de cerámica, caja de titanio");
        SmartPhone celu2 = new SmartPhone("Samsung Galaxy", "S22", 2022, 167, new double[]{146, 70.6, 7.6},
                "Android 12", 256, false, 6.1, 8, 50, "Snapdragon 8 Gen 1 3GHz", 3700);
        SmartWatch reloj2 = new SmartWatch("Samsung Galaxy", "Watch 3", 2020, 54, new double[]{45, 46.2, 11.1},
                "Tizen Wearable OS 5.5", 8, false, 1.4, 1, "Frente de vidrio, cuerpo de acero inoxidable o titanio");

        celu1.mostrar();
        reloj1.mostrar();
        celu2.mostrar();
        reloj2.mostrar();

    }
}
