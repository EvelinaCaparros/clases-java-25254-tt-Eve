import java.util.Scanner;

/**
 * Ejercicio 7: Listas (ArrayList)
 * ------------------------------
 * Escribe un programa que pida al usuario 5 nombres y los guarde en una lista. Luego, muestra todos los nombres ingresados.
 *
 * Ejemplo:
 *   Ingrese un nombre: Ana
 *   Ingrese un nombre: Luis
 *   ...
 *   Salida: [Ana, Luis, ...]
 *
 * Tip: Usa ArrayList<String> para almacenar los nombres.
 */
import java.util.ArrayList;
public class Ejercicio07_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(""" 
        Buenaaaaaaaaaaas! Por favor, ingresa 5 nombres!
        para que... te muestre los nombres que ingresaste... aun no sé por qué... porque puedo jaja                 
        """);

        ArrayList<String> listaNombres = new ArrayList<>();
        String nombre;

        for (int i=1; i<=5; i++) {
            System.out.println("Ingrese un nombre: ");
            while (!scanner.hasNext("[a-zA-ZáéíóúÁÉÍÓÚüñÑ]+")) {
                System.out.println("Eso no es un nombre me parece.... Intente de nuevo:");
                scanner.next(); //
            }
            nombre = scanner.nextLine();

            listaNombres.add(nombre);
        };

        System.out.println(listaNombres);
//Si quisiera uno a uno
        for (String nombres : listaNombres){
            System.out.println(nombres);
        };
    }
}
