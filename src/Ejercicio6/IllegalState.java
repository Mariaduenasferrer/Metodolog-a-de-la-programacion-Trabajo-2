package Ejercicio6;

import java.util.Scanner;

public class IllegalState {
    private static boolean closed = false;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            closeApplication(); // Cerramos la aplicación
            closeApplication(); // Intentamos cerrarla de nuevo, lo que genera la excepción
        } catch (IllegalStateException e) {
            System.out.println("Excepción: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
    public static void closeApplication() {
        if (closed) {
            throw new IllegalStateException("La aplicación ya está cerrada.");
        }
        closed = true;
        System.out.println("La aplicación se ha cerrado correctamente.");
    }
}
