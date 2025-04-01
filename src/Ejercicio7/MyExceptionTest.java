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
            System.out.println(ex.getMessage());
        }
    }
    /*
    Aquí tratamos de generar nuestro propio programa con nuestra propia excepción
    En él podemos ver que podemos introducir varos valores, los cuales si no son el correcto, por las condiciones de los if,
    da una ayuda para que el número pedido sea aproximado, ahora bien, si se introduce correctamente el valor pedido,
    generará una excepción deteniendo así el programa. Además, el printStackTrace nos dice donde se ha generado la excepción
    Print del StackTrace:
    at Ejercicio7.MyExceptionTest.number(MyExceptionTest.java:12)
	at Ejercicio7.MyExceptionTest.main(MyExceptionTest.java:20)
    */
}
