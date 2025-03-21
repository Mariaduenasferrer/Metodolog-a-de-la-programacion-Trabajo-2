package Ejercicio6.Dividirentre0;

import java.util.Scanner;


public class Dividir0usandoScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Solicitar al usuario que ingrese dos números
            System.out.print("Ingresa el numerador: "); // introduces numerador
            int numerador = scanner.nextInt();

            System.out.print("Ingresa el denominador: "); // introduces denominador40
            int denominador = scanner.nextInt();

            // Intentar realizar la división
            int resultado = numerador / denominador;
            System.out.println("El resultado de la división es: " + resultado);
        }

        // Se ejecuta si el  denominador es 0, sino lo salta y va al finally directamente
        catch (ArithmeticException e) {
            // Manejar el caso de división por cero
            System.out.println("Error: No se puede dividir entre cero.");

        }

        // Este bloque siempre se ejecuta
        finally {
            System.out.println("Operación de división finalizada.");
            scanner.close(); // Cerrar el Scanner para liberar recursos
        }
    }
}
