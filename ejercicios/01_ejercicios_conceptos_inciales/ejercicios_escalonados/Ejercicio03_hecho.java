import java.util.Scanner;

/**
 * Ejercicio 3: Condicionales
 * -------------------------
 * Escribe un programa que pida un número al usuario e indique si es positivo, negativo o cero.
 *
 * Ejemplo:
 *   Ingrese un número: -5
 *   Salida: El número es negativo.
 *
 * Tip: Usa if, else if y else para las condiciones.
 */
public class Ejercicio03_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
        Hola! No sabes si ese numero entero es un cero? 0️⃣❓
                  ➕❓ si es positivo? 
            si es negativo? ➖❓
           ¡¡¡¡NO SUFRAS MAS!!!!
        ‍🙋‍🙋‍♀️ ¡Yo te digo! 🙋‍♀️🙋‍♂️
        """);

        System.out.println("Ingresa el nro y conoce la verdad: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Eso no es un número enterooooo de nuevooooo");
            scanner.next();
        }
        int numero = scanner.nextInt();

        if (numero == 0) {
            System.out.println("Es un cero!");
        } else if (numero > 0){
            System.out.println("Es positivoooo!");
        } else {
            System.out.println("Es negativoooo!");
        }
    }
}
