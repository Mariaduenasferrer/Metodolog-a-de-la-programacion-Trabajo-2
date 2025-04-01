package Ejercicio6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class IllegalStateTest {

    @Test
    void testApplicationClosure() {
        // Simulamos el cierre de la aplicación
        IllegalState.closed = true;

        IllegalStateException exception = assertThrows(IllegalStateException.class, () -> {
            IllegalState.main(new String[]{});
        });

        assertEquals("La aplicación ya está cerrada.", exception.getMessage());
    }

    @Test
    void testApplicationNormalExecution() {
        // Simulamos el estado normal antes de cerrar
        IllegalState.closed = false;

        assertDoesNotThrow(() -> {
            IllegalState.main(new String[]{});
        });

        // Verificamos el estado después de la ejecución
        assertTrue(IllegalState.closed);
    }
}