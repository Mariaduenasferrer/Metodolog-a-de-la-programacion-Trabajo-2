package Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class MethodDTest {

    @Test
    void testManejarExcepcion_SinExcepcion() {
        MethodD methodD = new MethodD();

        // Verificamos que no se lance ninguna excepción cuando el valor es correcto
        methodD.manejarExcepcion(50);  // Este valor no debería lanzar excepciones
    }

    @Test
    void testPropagarExcepcion_XxxException() {
        MethodD methodD = new MethodD();

        // Verificamos que la XxxException sea propagada correctamente
        assertThrows(XxxException.class, () -> {
            methodD.propagarExcepcion(-10);  // Este valor debería provocar una XxxException
        });
    }

    @Test
    void testPropagarExcepcion_YyyException() {
        MethodD methodD = new MethodD();

        // Verificamos que la YyyException sea propagada correctamente
        assertThrows(YyyException.class, () -> {
            methodD.propagarExcepcion(200);  // Este valor debería provocar una YyyException
        });
    }
}
