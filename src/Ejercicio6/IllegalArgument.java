package Ejercicio6;

public class IllegalArgument {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int result = divide(a, b);
            System.out.println("Resultado: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }
    /*
    Ocurre una excepción si tratamos de dividir por 0
    Para capturar la excepción, usamos el if con la condición de que b == 0, para saber si el usuario trata de dividir por cero
     */
}
