package Ejercicio6;

public class IllegalArgument {
    public static void main(String[] args) {
        int result = divide(10, 0); // Intentamos dividir por cero
        System.out.println(result);

    }
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("El divisor no puede ser cero.");
        }
        return a / b;
    }
}
