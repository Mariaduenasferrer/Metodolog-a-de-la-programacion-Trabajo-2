package Ejercicio7;

public class MyException extends Exception {
    public MyException(int resultado) { //constructor
        super("number is " + resultado);
    }
}
