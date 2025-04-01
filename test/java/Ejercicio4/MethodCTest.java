package Ejercicio4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class MethodCTest {
    @Test
    void testXxxExceptionWhenValorIsNegative() {
        // Creamos una instancia de MethodC
        MethodC methodC = new MethodC();

        // Probar que se lanza la XxxException cuando el valor es negativo
        assertThrows(XxxException.class, () -> methodC.methodC(-1),
                "Se esperaba que se lanzara XxxException cuando el valor es negativo.");
    }

    @Test
    void testYyyExceptionWhenValorExceedsLimit() {
        // Creamos una instancia de MethodC
        MethodC methodC = new MethodC();

        // Probar que se lanza la YyyException cuando el valor excede 100
        assertThrows(YyyException.class, () -> methodC.methodC(101),
                "Se esperaba que se lanzara YyyException cuando el valor excede 100.");
    }

    @Test
    void testMethodCWithValidValue() {
        // Creamos una instancia de MethodC
        MethodC methodC = new MethodC();

        // Probar que no se lanza ninguna excepción cuando el valor es válido
        assertDoesNotThrow(() -> methodC.methodC(50),
                "No se esperaba ninguna excepción cuando el valor está dentro del rango permitido.");
    }
}
