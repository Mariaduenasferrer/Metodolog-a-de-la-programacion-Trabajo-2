package Ejercicio4;

// Excepciones personalizadas con visibilidad pública
class XxxException extends Exception {
    public XxxException(String mensaje) {
        super(mensaje);
    }
}
class YyyException extends Exception {
    public YyyException(String mensaje) {
        super(mensaje);
    }
}


public class MethodD {

    // Método que puede lanzar XxxException y YyyException
    public void methodD(int valor) throws XxxException, YyyException {
        // Simulación de una condición que lanza XxxException
        if (valor < 0) {
            throw new XxxException("Error: El valor no puede ser negativo (" + valor + ")");
        }

        // Simulación de una condición que lanza YyyException
        if (valor > 100) {
            throw new YyyException("Error: El valor excede el límite permitido (" + valor + ")");
        }

        System.out.println("Valor procesado correctamente: " + valor);
    }

    // Método que captura las excepciones lanzadas por methodD
    public void manejarExcepcion(int valor) {
        try {
            methodD(valor);
        } catch (XxxException e) {
            System.err.println("XxxException capturada: " + e.getMessage());
        } catch (YyyException e) {
            System.err.println("YyyException capturada: " + e.getMessage());
        }
    }

    // Método que propaga las excepciones sin capturarlas
    public void propagarExcepcion(int valor) throws XxxException, YyyException {
        methodD(valor);
    }

    public static void main(String[] args) {
        MethodD obj = new MethodD();

        System.out.println("Ejemplo con try/catch:");
        obj.manejarExcepcion(-5);  // Provoca XxxException
        obj.manejarExcepcion(150); // Provoca YyyException
        obj.manejarExcepcion(50);  // No lanza excepción

        System.out.println("\nEjemplo propagando la excepción:");
        try {
            obj.propagarExcepcion(-10);
        }

        catch (XxxException | YyyException e) {
            System.err.println("Excepción propagada y capturada en main: " + e.getMessage());
        }
    }
}

