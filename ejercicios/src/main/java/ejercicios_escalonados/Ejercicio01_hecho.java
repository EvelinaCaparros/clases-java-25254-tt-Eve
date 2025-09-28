import java.util.Scanner;

/**
 * Ejercicio 1: Variables y Tipos de Datos
 * --------------------------------------
 * Escribe un programa que pida al usuario su nombre y edad, y luego imprima un mensaje con esa información.
 *
 * Ejemplo:
 *   Ingrese su nombre: Juan
 *   Ingrese su edad: 25
 *   Salida: Hola Juan, tienes 25 años.
 *
 * Tip: Usa Scanner para leer datos desde la consola.
 */
public class Ejercicio01_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su edad: ");
        int edad = scanner.nextInt();
        while (edad <= 0 || edad >= 100) {  //Si la edad es menor o igual a cero o mayor igual a 100
            System.out.println("Ingrese una edad válida (entre 1 y 99): ");
            edad = scanner.nextInt();
        }
        System.out.println(generarSaludo(nombre, edad));
        scanner.close();
    }

    public static String generarSaludo(String nombre, int edad) {
        if (edad == 1) {
            return "Hola " + nombre + ", tenes " + edad + " año!";
        } else {
            return "Hola " + nombre + ", tenes " + edad + " años!";
        }
    }
}
