package Ejercicio4;

public class MethodC {
    public void MethodD(int valor) throws XxxException, YyyException {
        if (valor < 0) {
            throw new XxxException("Error: El valor no puede ser negativo (" + valor + ")");
        }
        if (valor > 100) {
            throw new YyyException("Error: El valor excede el límite permitido (" + valor + ")");
        }
        System.out.println("Valor procesado correctamente: " + valor);
    }

    public void methodC(int valor) throws XxxException, YyyException {
        // Llamada a methodD sin capturar las excepciones, solo las propaga
        MethodD(valor);
    }

}
