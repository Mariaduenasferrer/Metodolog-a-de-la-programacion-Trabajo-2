package Ejercicio3;

public class ArrayIndexOutOfBoundsException1 {
    /* 2. ArrayIndexOutOfBoundsException
     *    Se lanza cuando intentamos acceder a un índice de un array
     *    que está fuera de su rango.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando acceder a un índice de array fuera de rango...");
            int[] miArray = new int[5];
            miArray[10] = 42; // Provoca ArrayIndexOutOfBoundsException
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException capturada: " + e.getMessage());
        }
    }
}
