package Ejercicio3;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class AWTError1Test {

    @Test
    void testSimulacionAWTError() {
        assertThrows(AWTError.class, () -> {
            throw new AWTError("Simulación de AWTError");
        });
    }

}
