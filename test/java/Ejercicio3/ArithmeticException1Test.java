package Ejercicio3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ArithmeticException1Test {

    @Test
    public void testDivisionPorCero() {
        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            int resultado = 10 / 0;
        });

        String mensajeEsperado = "/ by zero";
        String mensajeReal = exception.getMessage();

        assertEquals(mensajeEsperado, mensajeReal, "El mensaje de excepción no coincide");
    }

}
