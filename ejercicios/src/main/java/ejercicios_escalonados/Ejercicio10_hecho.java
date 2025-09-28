import java.util.*;

/**
 * Ejercicio 10: Recorrer un Diccionario
 * -------------------------------------
 * Escribe un programa que permita ingresar varios pares nombre-edad y luego muestre todos los nombres de personas mayores de edad (18 o más).
 *
 * Ejemplo:
 *   ¿Cuántas personas vas a ingresar? 3
 *   Ingrese nombre: Juan
 *   Ingrese edad: 17
 *   ...
 *   Salida: Personas mayores de edad: [Ana, Pedro]
 *
 * Tip: Usa un bucle for-each para recorrer el HashMap.
 */
public class Ejercicio10_hecho {
    public static void main(String[] args) {
        // Tu código aquí
        Scanner scanner = new Scanner(System.in);
        HashMap<String, Integer> nombreEdad = new HashMap<>();
        String nombre;
        int edad;
        int cantidadPersonas;

        System.out.println("¿Cuántas personas vas a ingresar?");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next();
        }
        cantidadPersonas = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer
        for (int i = 1; i <= cantidadPersonas; i++) {
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
            scanner.nextLine(); // Limpiar el buffer

            nombreEdad.put(nombre, edad);
        }

        List<String> mayores = new ArrayList<>();

        nombreEdad.forEach((nombreForEach, edadForEach) -> {
            if (edadForEach >= 18) {
                mayores.add(nombreForEach);
            }
        });

        /*Otras opciones:
        OPCION 1
        for (String nombre : nombreEdad.keySet()) {
          int edad = nombreEdad.get(nombre);
          if (edad >= 18) {
             mayores.add(nombre);
          }
       }

        OPCION 2
        - Cada entry representa un par (nombre, edad).
        - Map.Entry<String, Integer> representa cada par clave-valor (nombre y edad) dentro del mapa
        - entry es la variable que, en cada vuelta del bucle, contiene un par (nombre, edad). Así puedes acceder tanto al nombre (entry.getKey())
        como a la edad (entry.getValue()) de cada elemento del mapa
        - Si la edad es > o = a 18, se agrega el nombre (entry.getKey()) a la lista mayores.


        for(Map.Entry<String, Integer> entry : nombreEdad.entrySet()) {
            if (entry.getValue() >= 18) {
                mayores.add(entry.getKey());
            }
        }*/
        System.out.println("Personas mayores de edad: " + mayores);
    }
}
