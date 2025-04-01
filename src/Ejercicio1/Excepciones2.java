package Ejercicio1;
public class Excepciones2 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }
    public static void methodA() {
        System.out.println("Enter methodA()");
        methodB();
        System.out.println("Exit methodA()");
    }
    public static void methodB() {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }
    public static void methodC() {
        System.out.println("Enter methodC()");
        try {
            methodD();
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en methodC(): " + e.getMessage());
        };
        System.out.println("Exit methodC()");
    }

    public static void methodD() {
        System.out.println("Enter methodD()");
        System.out.println(1 / 0);
        System.out.println("Exit methodD()");

    }

}
/*
SIN TRY-CATCH:
- Entra el metodo main, invoca al metodo A
- Entra el metodo A, invoca al metodo B
- Entra el metodo B, invoca al metodo C
- Entra el metodo C, invoca al metodo D
- El metodo D contiene un ArithmeticException, es decir, dividir por 0 y por tanto se retira
- Como ningún metodo maneja dicha excepcion, la JVM cierra el codigo y muestra el error.
CON TRY-CATCH:
- Entra el metodo main, invoca al metodo A
- Entra el metodo A, invoca al metodo B
- Entra el metodo B, invoca al metodo C
- Entra el metodo C, invoca al metodo D dentro del try que tiene una excepion entonces,
cuando ocurre la excepcion, la captura el bloque catch que hace que el programa no se interrumpe de forma abrupta,
se imprime los detalles de la excepción
- Sale el metodo C
- Pasa al metodo B pero como el metodo C ya salio, tambien sale
- Sale el metodo A
- Sale el metodo main
- Termina el programa
(No se imprime "Exit methodD()"  porque la excepción se lanza antes de llegar a esa línea de código)
 */
