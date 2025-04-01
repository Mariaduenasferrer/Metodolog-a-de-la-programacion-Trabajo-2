package Ejercicio6;

public class NullPointer {
    public static void main(String[] args) {
        String[] strs = new String[3];
        System.out.println(strs[0].length());
    }
    /*
    Aquí el error se da por pedir en específico un dato perteneciente a un elemento de la lista
    Lo cual genera un error debido a que solo se ha generado la lista, y no se ha añadido ningún valor
    por lo que todos los valores de la lista son null, pero en realidad no generaría un error con solo eso
    el error se da porque le pedimos a la máquina que nos de el tamaño(length) de un null.
     */
}
