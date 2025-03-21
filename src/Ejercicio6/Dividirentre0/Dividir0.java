package Ejercicio6.Dividirentre0;

public class Dividir0 {
    public static void main(String[] args) {
        try {
            // Da error por dividir entre 0
            int resultado = 10 / 0; // Esto lanza una excepción
        }

        catch (ArithmeticException e) {
            System.out.println("Error: No se puede dividir entre cero.");
        }
        System.out.println("El programa continúa después del catch.");
    }
}
