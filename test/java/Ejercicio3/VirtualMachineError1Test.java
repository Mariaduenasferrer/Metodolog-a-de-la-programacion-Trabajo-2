package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertInstanceOf;

public class VirtualMachineError1Test {
    @Test
    void testOutOfMemoryError() {
        // Intentamos capturar un OutOfMemoryError simulado
        try {
            // Simulamos un OutOfMemoryError
            throw new OutOfMemoryError("Simulación de OutOfMemoryError");
        } catch (OutOfMemoryError e) {
            // Verificamos que se ha capturado el OutOfMemoryError correctamente
            assertInstanceOf(OutOfMemoryError.class, e);
            assertEquals("Simulación de OutOfMemoryError", e.getMessage(), "El mensaje de la excepción no es el esperado.");
        }
    }
}
