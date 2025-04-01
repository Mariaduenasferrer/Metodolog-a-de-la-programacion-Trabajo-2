package Ejercicio3;

public class IllegalArgumentException1 {
    /* 4. IllegalArgumentException
     *    Sucede cuando un método recibe un argumento no válido.
     *    Un ejemplo es establecer una prioridad de hilo fuera de rango.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando establecer prioridad de hilo inválida...");
            Thread hilo = new Thread();
            hilo.setPriority(100); // Provoca IllegalArgumentException (valor fuera de 1-10)
        }

        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException capturada: " + e.getMessage());
        }
    }
}
