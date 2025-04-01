package Ejercicio6;

import org.junit.Test;

public class ArrayIndexOutOfBoundsTest {

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void main() {
        int[] array = new int[4];
        // Intentar acceder a un índice fuera de los límites
        int value = array[10]; // Esto debe lanzar ArrayIndexOutOfBoundsException
        System.out.println(value);
    }
}