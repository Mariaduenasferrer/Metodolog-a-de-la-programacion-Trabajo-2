package Ejercicio1;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class Excepciones2Test {

    @Test
    public void testExcepcioninesperada() {
        try {
            Excepciones2.main(new String[]{});
        } catch (Exception e) {
            fail("El programa lanzó una excepción inesperada: " + e.getMessage());
        }


    }
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
        String output = captureOutput(() -> Excepciones2.methodA());

        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Exit methodC()"));
        assertTrue(output.contains("Exit methodB()"));
        assertTrue(output.contains("Exit methodA()"));
    }

    @Test
    public void testMethodB() {
        String output = captureOutput(() -> Excepciones2.methodB());

        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Exit methodC()"));
        assertTrue(output.contains("Exit methodB()"));
    }

    @Test
    public void testMethodC() {
        String output = captureOutput(() -> Excepciones2.methodC());

        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
        assertTrue(output.contains("Excepción capturada en methodC(): / by zero"));
        assertTrue(output.contains("Exit methodC()"));
    }

    @Test
    public void testMethodD() {
        String outputBeforeException = captureOutput(() -> {
            try {
                Excepciones2.methodD();
            } catch (ArithmeticException e) {
            }
        });

        assertTrue(outputBeforeException.contains("Enter methodD()"));

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> {
            Excepciones2.methodD();
        });

        assertTrue(exception.getMessage().contains("/ by zero"));
    }



    @Test
    public void testMain() {
        String output = captureOutput(() -> Excepciones2.main(new String[]{}));

        assertTrue(output.contains("Enter main()"));
        assertTrue(output.contains("Enter methodA()"));
        assertTrue(output.contains("Enter methodB()"));
        assertTrue(output.contains("Enter methodC()"));
        assertTrue(output.contains("Enter methodD()"));
        assertTrue(output.contains("Excepción capturada en methodC(): / by zero"));
        assertTrue(output.contains("Exit methodC()"));
        assertTrue(output.contains("Exit methodB()"));
        assertTrue(output.contains("Exit methodA()"));
        assertTrue(output.contains("Exit main()"));
    }


}