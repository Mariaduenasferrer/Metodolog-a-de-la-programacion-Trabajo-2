package Ejercicio6;

import org.junit.Test;
import static org.junit.Assert.*;

public class IllegalArgumentTest {

    @Test(expected = IllegalArgumentException.class)
    public void testDivideByZero() {
        IllegalArgument.divide(10, 0);
    }

    @Test
    public void testDivideValid() {
        assertEquals(5, IllegalArgument.divide(10, 2));
    }
}