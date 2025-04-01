package Ejercicio3;

public class LinkageError1 {
    /* 6. LinkageError
     *    Ocurre cuando hay problemas con la vinculación de clases (por ejemplo,
     *    versiones incompatibles, clases duplicadas, etc.).
     *    Aquí se muestra un bloque try-catch teórico.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando forzar LinkageError...");
            // Un caso típico sería cargar dinámicamente una clase incompatible.
            // Este ejemplo sólo lanzará ClassNotFoundException si la clase no existe,
            // pero se incluye la captura de LinkageError para mostrar cómo sería.
            Class.forName("com.ejemplo.ClaseInexistente");
        }

        catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException capturada (no es LinkageError): " + e.getMessage());
        }

        catch (LinkageError e) {
            // LinkageError atrapado (NoClassDefFoundError, etc.)
            System.out.println("LinkageError capturado: " + e.toString());
        }

    }
}
