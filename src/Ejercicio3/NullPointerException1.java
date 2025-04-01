package Ejercicio3;

public class NullPointerException1 {
    /* 3. NullPointerException
     *    Se produce al intentar acceder a un método o atributo de
     *    un objeto que es null.*/
    public static void main(String[] args) {
        try {
            System.out.println("\nIntentando usar un objeto nulo...");
            String texto = null;
            int longitud = texto.length(); // Provoca NullPointerException
        }

        catch (NullPointerException e) {
            System.out.println("NullPointerException capturada: " + e.getMessage());
        }
    }

}
