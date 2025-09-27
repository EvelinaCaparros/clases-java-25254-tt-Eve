import java.util.Scanner;
import java.util.HashMap;

/**
 * Ejercicio 9: Diccionarios (HashMap)
 * -----------------------------------
 * Escribe un programa que permita guardar el nombre y la edad de 3 personas en un HashMap. Luego, pide un nombre y muestra la edad correspondiente.
 *
 * Ejemplo:
 *   Ingrese nombre: Ana
 *   Ingrese edad: 20
 *   ...
 *   ¿Qué nombre quieres buscar? Ana
 *   Salida: Ana tiene 20 años.
 *
 * Tip: Usa HashMap<String, Integer> para almacenar los datos. HashMap<String, Integer> nombreVariable = new HashMap<>();
 */
public class Ejercicio09_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nombreEdad = new HashMap<>();
        String nombre;
        String nombreBuscado;
        int edad;

        System.out.println("Te voy a pedir 3 nombres y edades.");
        for (int i=1; i<=3; i++) {
            System.out.println("Ingrese nombre: ");
            while (!scanner.hasNext("[a-zA-ZáéíóúÁÉÍÓÚüñÑ]+")) {
                System.out.println("Eso no es un nombre me parece.... Intente de nuevo:");
                scanner.nextLine(); //
            }
            nombre = scanner.nextLine();
            System.out.println("Ingrese edad: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número entero. Intente de nuevo:");
                scanner.next(); //
            }
            edad = scanner.nextInt();
            scanner.nextLine();

            nombreEdad.put(nombre, edad);
        };

        System.out.println("¿Qué nombre quieres buscar?");
        while (!scanner.hasNext("[a-zA-ZáéíóúÁÉÍÓÚüñÑ]+")) {
            System.out.println("Eso no es un nombre me parece.... Intente de nuevo:");
            scanner.next(); //
        }
        nombreBuscado = scanner.nextLine();

        System.out.println(nombreBuscado + " tiene " + nombreEdad.get(nombreBuscado) + " años.");



    }
}
