package Ejercicio2;
public class Excepciones3 {
    public static void main(String[] args) {
        System.out.println("Enter main()");
        methodA();
        System.out.println("Exit main()");
    }

    public static void methodA() {
        System.out.println("Enter methodA()");
        try {
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Excepción capturada en methodA(): " + e.getMessage());
        }
        System.out.println("Exit methodA()");
    }

    public static void methodB() throws ArithmeticException {
        System.out.println("Enter methodB()");
        methodC();
        System.out.println("Exit methodB()");
    }

    public static void methodC() throws ArithmeticException {
        System.out.println("Enter methodC()");
        methodD();
        System.out.println("Exit methodC()");
    }

    public static void methodD() throws ArithmeticException {
        System.out.println("Enter methodD()");
        System.out.println(1 / 0);
        System.out.println("Exit methodD()");
    }
}

/*
- Entra el metodo main que llama al metood A
- Entra el metodo A y se entra en un bloque try  que llama al metodo B
- Entra el metodo B y llama al metodo C
- Entra el medofo C y llama al metodo D, aparece una excepcion al dividir enre 0
- Entra en el metodo C, como no hay bloque catch, sigue "subiendo"
- Entra en el metodo B y pasa lo mismo que en el C
- Entra en el metodo A, que si contiene el bloque catch, captura la excepcion e imprime el tipo de error.
- Sale el metodo A
- Sale el merodo main

 */
