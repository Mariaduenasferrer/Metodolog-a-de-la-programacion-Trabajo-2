package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkageError1Test {
    @Test
    void testClassNotFoundException() {
        // Aquí se asegura de que una ClassNotFoundException sea capturada
        try {
            // Intentamos cargar una clase que no existe
            Class.forName("com.ejemplo.ClaseInexistente");
            fail("Se esperaba una ClassNotFoundException"); // Si no lanza la excepción, fallará
        } catch (ClassNotFoundException e) {
            // Verificamos que el mensaje de la excepción contiene el nombre de la clase
            assertTrue(e.getMessage().contains("com.ejemplo.ClaseInexistente"), "El mensaje de la excepción no contiene el nombre de la clase esperada");
        } catch (LinkageError e) {
            // Si llega aquí, significa que se ha capturado un LinkageError en lugar de ClassNotFoundException
            fail("Se esperaba una ClassNotFoundException, no un LinkageError");
        }
    }

    @Test
    void testLinkageError() {
        // Aquí estamos simulando un posible escenario de LinkageError
        try {
            // Este código no lanza realmente un LinkageError, es solo un ejemplo
            // En un escenario real, aquí se cargaría una clase incompatible
            throw new LinkageError("Simulación de un error de vinculación");
        } catch (LinkageError e) {
            // Verificamos que el LinkageError se haya capturado correctamente
            assertEquals("Simulación de un error de vinculación", e.getMessage());
        }
    }
}
