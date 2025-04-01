package Ejercicio7;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MyExceptionTestTest {

    @Test
    public void testNumberGreaterThan48() {
        try {
            MyExceptionTest.number(50); // Caso mayor que 48
        } catch (MyException e) {
            fail("No se debería lanzar excepción para un número mayor que 48");
        }
    }

    @Test
    public void testNumberLessThan48() {
        try {
            MyExceptionTest.number(40); // Caso menor que 48
        } catch (MyException e) {
            fail("No se debería lanzar excepción para un número menor que 48");
        }
    }

    @Test
    public void testNumberEqualTo48() {
        // Verifica que se lanza una excepción MyException cuando el número es 48
        MyException exception = assertThrows(MyException.class, () -> {
            MyExceptionTest.number(48);
        });

        assertEquals("number is 48", exception.getMessage());
    }
}