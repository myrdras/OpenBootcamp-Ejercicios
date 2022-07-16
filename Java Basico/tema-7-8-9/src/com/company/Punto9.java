package com.company;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Punto9 {
    public static void main(String[] args) {

        copiaYAgregaAFichero("F:/Windows/y.txt", "Usuarios.txt");

    }

    public static void copiaYAgregaAFichero(String fileIn, String fileOut) {

        try {
            InputStream in = new FileInputStream(fileIn);
            byte[] datosIn = in.readAllBytes();
            in.close();

            PrintStream out = new PrintStream(fileOut);
            out.write(datosIn);

            String[] datos =  cargarDatos();

            for (String dato : datos) {
                out.print(dato);
            }

            out.close();

        } catch (Exception e) {
            System.out.println("Excepcion: " + e.getMessage());
        }

    }

    private static String[] cargarDatos() {
        ArrayList<HashMap<String, String>> lista = new ArrayList<>();

        String[] usuarios = {"", "", ""};
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            HashMap<String, String> mapa = new HashMap<>();
            System.out.println("Agrega " + (3-i) + " usuarios");

            System.out.print("Nombre: ");
            mapa.put("Usuario", sc.next());

            System.out.print("Clave: ");
            mapa.put("Clave", sc.next());

            lista.add(mapa);
        }

        int pos = 0;
        for (HashMap<String, String> map : lista) {
            int valores = 1;

            for (Map.Entry<String, String> str: map.entrySet()) {
                usuarios[pos] += str.getKey() + ": " + str.getValue();

                if (valores < 2) {
                    usuarios[pos] += " - ";
                }

                valores++;
            }
            usuarios[pos] += "\n";
            pos++;
        }

        return usuarios;
    }
}
