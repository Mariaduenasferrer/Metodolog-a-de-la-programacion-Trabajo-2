package Ejercicio2;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Excepciones3Test {

    private String captureOutput(Runnable methodToTest) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream originalSystemOut = System.out;
        System.setOut(new PrintStream(outputStream));

        try {
            methodToTest.run();
        } finally {
            System.setOut(originalSystemOut);
        }

        return outputStream.toString();
    }

    @Test
    public void testMethodA() {
        String output = captureOutput(() -> Excepciones3.methodA());

        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
        assertTrue(output.contains("Excepción capturada en methodA(): / by zero"));
        assertTrue(output.contains("Exit methodA()"));
    }

    @Test
    public void testMethodB() {
        String output = captureOutput(() -> {
            try {
                Excepciones3.methodB();
            } catch (ArithmeticException e) {
            }
        });

        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
    }

    @Test
    public void testMethodC() {
        String output = captureOutput(() -> {
            try {
                Excepciones3.methodC();
            } catch (ArithmeticException e) {
            }
        });

        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
    }

    @Test
    public void testMethodD() {
        String output = captureOutput(() -> {
            try {
                Excepciones3.methodD();
            } catch (ArithmeticException e) {
            }
        });

        assertTrue(output.contains("Enter methodD()"));
        assertFalse(output.contains("Excepción capturada en methodA(): / by zero"));

        assertFalse(output.contains("Exit methodD()"));


    }

    @Test
    public void testMain() {
        String output = captureOutput(() -> Excepciones3.main(new String[]{}));

        assertTrue(output.contains("Enter main()"));
        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
        assertTrue(output.contains("Excepción capturada en methodA(): / by zero"));
        assertTrue(output.contains("Exit methodA()"));
        assertTrue(output.contains("Exit main()"));
    }
}


