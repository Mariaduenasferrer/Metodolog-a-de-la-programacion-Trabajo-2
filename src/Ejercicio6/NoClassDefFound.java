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
}
