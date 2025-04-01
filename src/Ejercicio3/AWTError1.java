package Ejercicio3;

public class AWTError1 {
    /* 7. AWTError
     *    Se lanza cuando hay un problema grave con el sistema AWT
     *    (Abstract Window Toolkit). Es raro, pero puede ocurrir si, por ejemplo,
     *    no hay un entorno gráfico adecuado.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando forzar AWTError...");
            // Ejemplo: Intentar inicializar AWT sin entorno gráfico.
            // En algunos sistemas sin interfaz gráfica podría lanzar AWTError.
            java.awt.Frame frame = new java.awt.Frame("Test AWTError");
            frame.addNotify();
        }

        catch (java.awt.AWTError e) {
            System.out.println("AWTError capturado: " + e.toString());
        }
    }
}
