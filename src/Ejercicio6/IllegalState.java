package Ejercicio6;

import java.util.Scanner;

public class IllegalState {

    static boolean closed;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Cerrar la aplicación
            if (closed) {
                throw new IllegalStateException("La aplicación ya está cerrada.");
            }
            closed = !closed;
            System.out.println("La aplicación se ha cerrado correctamente.");
        } catch (IllegalStateException e) {
            System.out.println("Excepción: " + e.getMessage());
            throw e;
        } finally {
            scanner.close();
        }
    }
    /*
    Aquí queremos aplicar dos veces un metodo el cual está diseñado para ser usado una vez
    generando así un error, en el ejemplo del programa,
    el error se produce porque no podemos cerrar una aplicación que ya está cerrada
     */
}
