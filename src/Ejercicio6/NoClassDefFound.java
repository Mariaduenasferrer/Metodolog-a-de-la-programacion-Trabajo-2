package Ejercicio6;

public class NoClassDefFound {
    public static void main(String[] args) {
        try {
            Class.forName("SomeClass"); // Verifica si la clase existe
            System.out.println("SomeClass está disponible.");
        } catch (ClassNotFoundException e) {
            System.out.println("SomeClass no está definida.");
        }
    }
    /*
    El error aquí se da por buscar una clase que en realidad no existe o está fuera del paquete
    Como no encuentra la clase, salta la excepción, la cual es capturada con el try catch
     */
}
