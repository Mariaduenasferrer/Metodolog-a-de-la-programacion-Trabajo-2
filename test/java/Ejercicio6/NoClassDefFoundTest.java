package Ejercicio6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NoClassDefFoundTest {

    @Test
    void testClassExists() {
        // Simulamos que la clase "String" existe
        assertDoesNotThrow(() -> {
            Class.forName("java.lang.String");
            System.out.println("La clase String está disponible.");
        });
    }

    @Test
    void testClassDoesNotExist() {
        Exception exception = assertThrows(ClassNotFoundException.class, () -> {
            NoClassDefFound.main(new String[]{}); // Esta clase no existe
        });

        assertEquals("SomeClass", exception.getMessage());
    }
}