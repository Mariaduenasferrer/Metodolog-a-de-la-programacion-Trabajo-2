package Ejercicio3;

public class VirtualMachineError1 {
    /* 5. VirtualMachineError (ejemplo: OutOfMemoryError)
     *    Se produce cuando la máquina virtual de Java está en un estado
     *    crítico (falta de memoria, etc.). Forzar un OutOfMemoryError es
     *    arriesgado. Se muestra un ejemplo teórico de cómo capturarlo.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando forzar VirtualMachineError (OutOfMemoryError)...");
            // Esto podría lanzar OutOfMemoryError en caso de no disponer de memoria suficiente.
            // Ajusta con cuidado si no quieres colgar tu sistema.
            int[] arregloEnorme = new int[Integer.MAX_VALUE];
        }

        catch (VirtualMachineError e) {
            System.out.println("VirtualMachineError capturado: " + e.toString());
        }
    }
}
