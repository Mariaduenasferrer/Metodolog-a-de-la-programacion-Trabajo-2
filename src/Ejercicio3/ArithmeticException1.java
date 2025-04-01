package Ejercicio3;

public class ArithmeticException1 {
     /*ArithmeticException
      * Ocurre cuando se realiza una operación aritmética ilegal, por ejemplo,
      * la división entre cero.*/
    public static void main(String[] args) {

        /*
         * 1. ArithmeticException
         *    Ocurre cuando se realiza una operación aritmética ilegal,
         *    por ejemplo, la división entre cero.
         */
        try {
            System.out.println("Intentando división entre cero...");
            int resultado = 10 / 0; // Provoca ArithmeticException
        }

        catch (ArithmeticException e) {
            System.out.println("ArithmeticException capturada: " + e.getMessage());
        }

    }
}
