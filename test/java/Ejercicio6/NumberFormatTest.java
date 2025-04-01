package Ejercicio6;

import org.junit.Test;

public class NumberFormatTest {

    @Test(expected = NumberFormatException.class)
    public void main() {
        // Intentar convertir una cadena no numérica
        Integer.parseInt("abc"); // Esto debe lanzar NumberFormatException
    }
}