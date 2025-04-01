package Ejercicio6;

import org.junit.Test;

public class ClassCastTest {

    @Test(expected = ClassCastException.class)
    public void main() {
        Object o = new Object();
        // Intentar hacer un cast a Integer
        Integer i = (Integer) o; // Esto debe lanzar ClassCastException
    }
}