package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class IllegalArgumentException1Test {
    @Test
    void testPrioridadHiloInvalida() {
        assertThrows(IllegalArgumentException.class, () -> {
            Thread hilo = new Thread();
            hilo.setPriority(100); // Esto debería lanzar la excepción
        });
    }
}
