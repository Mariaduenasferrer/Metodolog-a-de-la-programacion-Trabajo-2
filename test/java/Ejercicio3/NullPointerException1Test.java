package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class NullPointerException1Test {
    @Test
    void testNullPointerException() {
        // Aquí vamos a probar que una NullPointerException se lanza
        assertThrows(NullPointerException.class, () -> {
            // Intentamos ejecutar el código que lanza la NullPointerException
            String texto = null;
            int longitud = texto.length(); // Esto debe lanzar la NullPointerException
        });
    }
}
