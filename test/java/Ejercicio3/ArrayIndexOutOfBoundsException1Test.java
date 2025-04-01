package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ArrayIndexOutOfBoundsException1Test {
    @Test
    void testAccesoIndiceFueraDeRango() {
        Exception exception = assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            int[] miArray = new int[5];
            miArray[10] = 42; // Esto debería lanzar la excepción
        });

        // Verificar que el mensaje de error contiene información sobre el índice fuera de rango
        assertTrue(exception.getMessage().contains("10"), "El mensaje de la excepción debería contener el índice fuera de rango");
    }
}
