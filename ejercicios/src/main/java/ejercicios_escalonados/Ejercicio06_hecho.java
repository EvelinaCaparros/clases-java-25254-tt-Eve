import java.util.Scanner;

/**
 * Ejercicio 6: Bucle For
 * ----------------------
 * Escribe un programa que pida un número entero positivo n y muestre los números del 1 al n.
 *
 * Ejemplo:
 *   Ingrese un número: 5
 *   Salida: 1 2 3 4 5
 *
 * Tip: Usa un bucle for para recorrer los números.
 */
public class Ejercicio06_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(""" 
        Hola, voy a mostrarte todos los nros enteros positivos que me pidas!                 
        """);
        int nroPositivo;
        System.out.println("Ingrese el nro: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next(); //
        }
        nroPositivo = scanner.nextInt();

        StringBuilder listaNros = new StringBuilder();

        for (int i=1; i<=nroPositivo; i++) { //recorre mientras i<=nroPositivo
            listaNros.append(i + " ");
        };

        System.out.println(listaNros);

    }
}
