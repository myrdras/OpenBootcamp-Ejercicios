package com.company;

public class Punto7 {

    public static void main(String[] args) {
        try {
            int resul = DividePorCero(40, 10);
            System.out.println(resul);
        } catch (Exception e) {
            System.out.println("Esto no puede hacerse");
        }
    }

    public static int DividePorCero (int num1, int num2) throws ArithmeticException {
        try {
            return num1 / num2;
        } catch (ArithmeticException e) {
            throw new ArithmeticException();
        } finally {
            System.out.println("Demo de código");
        }
    }

}
