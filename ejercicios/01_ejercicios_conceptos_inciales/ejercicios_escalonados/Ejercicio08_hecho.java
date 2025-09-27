import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ejercicio 8: Buscar en una Lista
 * --------------------------------
 * Escribe un programa que pida al usuario una lista de números (primero pregunta cuántos va a ingresar) y luego pregunte por un número a buscar.
 * Indica si el número está en la lista o no.
 *
 * Ejemplo:
 *   ¿Cuántos números vas a ingresar? 4
 *   Ingrese un número: 5
 *   Ingrese un número: 8
 *   Ingrese un número: 2
 *   Ingrese un número: 7
 *   ¿Qué número quieres buscar? 2
 *   Salida: El número 2 está en la lista.
 *
 * Tip: Usa ArrayList<Integer> y el metodo contains.
 */
public class Ejercicio08_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> listaNros = new ArrayList<>();
        int cantidadNros;
        int nro;
        int nroBuscado;

        System.out.println("¿Cuántos números vas a ingresar?");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next(); //
        }
        cantidadNros = scanner.nextInt();

        for (int i=1; i<=cantidadNros; i++) {
            System.out.println("un número: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número entero. Intente de nuevo:");
                scanner.next();
            }
            nro = scanner.nextInt();
            listaNros.add(nro);
        };

        System.out.println("¿Qué número quieres buscar?");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next();
        }
        nroBuscado = scanner.nextInt();

        if(listaNros.contains(nroBuscado)){
            System.out.println("El número " + nroBuscado + " está en la lista.");
        } else {
            System.out.println("El número " + nroBuscado + " NO está en la lista.");
        }
    }
}
