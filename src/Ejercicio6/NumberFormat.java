package Ejercicio6;

public class NumberFormat {
    public static void main(String[] args) {
        Integer.parseInt("abc");
    }
    /*
    Aquí se genera una excepción, debido a que tratamos de cambiar en este caso un String a un Integer
    Como "abc" no representa ningún valor numérico, genera una excepción
    Pero sí colocáramos por ejemplo "7", el programa funcionaria correctamente
     */
}
