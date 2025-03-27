package Ejercicio7;

public class MyExceptionTest {
    public static void number(int number) throws MyException {
        if (number > 48) {
            System.out.println("El numero debe ser menor");
        }
        if (number < 48) {
            System.out.println("El numero debe ser mayor");
        }
        if (number == 48) {
            throw (new MyException(48));
        }
    }

    public static void main(String[] args) {
        try {
            number(40); // does not trigger exception
            number(50);
            number(48); // trigger exception
        } catch (MyException ex) { // exception handler
            ex.printStackTrace();
        }
    }
}
