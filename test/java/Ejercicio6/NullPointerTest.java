package Ejercicio6;

import org.junit.Test;

public class NullPointerTest {

    @Test(expected = NullPointerException.class)
    public void main() {
        String[] strs = new String[3];
        System.out.println(strs[0].length());
    }
}