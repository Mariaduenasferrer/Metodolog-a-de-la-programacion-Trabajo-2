package Ejercicio6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFound {
    public static void main(String[] args) {
        // Ruta del archivo que queremos leer
        File file = new File("archivo_inexistente.txt");

        try (Scanner scanner = new Scanner(file)) { // try-with-resources para manejo de recursos
            System.out.println("Archivo encontrado y leído.");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }

        catch (FileNotFoundException e) {
            System.out.println("Error: El archivo no fue encontrado.");
        }

        finally {
            System.out.println("Finalizando la búsqueda del archivo.");
        }
    }
}

