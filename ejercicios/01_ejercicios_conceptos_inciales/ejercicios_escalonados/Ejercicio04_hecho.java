import java.util.Scanner;

/**
 * Ejercicio 4: Múltiples Condiciones
 * ----------------------------------
 * Escribe un programa que pida la edad de una persona e indique si es un niño (0-12), adolescente (13-17), adulto (18-64) o adulto mayor (65+).
 *
 * Ejemplo:
 *   Ingrese su edad: 15
 *   Salida: Eres adolescente.
 *
 * Tip: Usa operadores lógicos para combinar condiciones.
 */
public class Ejercicio04_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hola! Ingresa tu edad y te digo a que grupo perteneces");

        System.out.println("Ingresa tu edad: ");
        while (!scanner.hasNextInt()) {
            System.out.println("Las edades son numeros enteros!");
            scanner.next();
        }
        int edad = scanner.nextInt();

        if (edad <= 0){
            System.out.println("Edad no valida");
        } else if (edad > 0 && edad < 13) {
            System.out.println("Sos un niño!");
        }else if (edad > 12 && edad < 18) {
            System.out.println("Sos un adolescente!");
        }else if (edad > 17 && edad < 65) {
            System.out.println("Sos un adulto!");
        }else if (edad > 64) {
            System.out.println("Sos un adulto mayor!");
        } else {
            System.out.println("WTF?"); //no deberia ejecutarse nunca
        }
    }
}
