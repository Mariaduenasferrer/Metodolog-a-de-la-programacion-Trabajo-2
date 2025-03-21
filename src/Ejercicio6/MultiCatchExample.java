package Ejercicio6;

import java.util.Scanner;

public class MultiCatchExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese un número: ");
            int num = Integer.parseInt(scanner.nextLine()); // Puede lanzar NumberFormatException

            System.out.print("Ingrese divisor: ");
            int divisor = Integer.parseInt(scanner.nextLine());

            int resultado = num / divisor; // Puede lanzar ArithmeticException
            System.out.println("Resultado: " + resultado);
        }
        // si no se introduce un numero entero con numeros tenemos este error
        catch (NumberFormatException e) {
            System.out.println("Error: Entrada no válida. Debe ser un número entero.");
        }

        // si el denominador es 0 tenemos este error
        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }

        // si no hay ningun tipo de error, sale resultado en int
        finally {
            System.out.println("Finalizando operación.");
            scanner.close();
        }
    }
}

