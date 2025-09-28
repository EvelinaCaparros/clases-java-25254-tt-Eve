import java.util.Scanner;

/**
 * Ejercicio 5: Bucle While
 * ------------------------
 * Escribe un programa que pida números al usuario hasta que ingrese el número 0. Al final, muestra la suma de todos los números ingresados (sin contar el 0).
 *
 * Ejemplo:
 *   Ingrese un número: 3
 *   Ingrese un número: 5
 *   Ingrese un número: 0
 *   Salida: La suma es 8
 *
 * Tip: Usa un bucle while y una variable acumuladora.
 */
public class Ejercicio05_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
               
                Hola! Voy a sumar toooooodo los numeros enteros que me pases hasta queeee
        🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁🥁
                                  ¡¡¡Pongas un cero!!!
                                  
        """);
        int suma = 0;
        int numeroLeido = -1;
        while (numeroLeido !=0) { //mientras numeroLeido sea distinto de 0
            System.out.println("Ingrese el nro: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Eso no es un número entero. Intente de nuevo:");
                scanner.next(); //
            }
            numeroLeido = scanner.nextInt();
            suma += numeroLeido;
        }
        System.out.println(suma);
    }
}
