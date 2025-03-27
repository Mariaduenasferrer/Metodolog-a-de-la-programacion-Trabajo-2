package Ejercicio6;

public class ArrayIndexOutOfBounds {
    public static void main(String[] args) {
        //Queremos generar una lista de tamaño cualquiera, y pedirle un valor fuera de rango
        int[] Array = new int[4];
        System.out.println(Array[10]);
    }
}
