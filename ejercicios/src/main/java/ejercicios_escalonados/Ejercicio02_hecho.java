import java.util.Scanner;

/**
 * Ejercicio 2: Operaciones Básicas
 * --------------------------------
 * Escribe un programa que pida dos números enteros al usuario y muestre la suma, resta, multiplicación y división de ambos.
 *
 * Ejemplo:
 *   Ingrese el primer número: 8
 *   Ingrese el segundo número: 2
 *   Salida:
 *     Suma: 10
 *     Resta: 6
 *     Multiplicación: 16
 *     División: 4
 *
 * Tip: Recuerda convertir los datos de entrada a enteros y manejar la división por cero. --> solicito de vuelta para no tener problemas con redondeo
 */
public class Ejercicio02_hecho {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
        Hola! Soy tu calculadora amiga! Te voy a pedir los numeros y la opción que deseas que haga!
        Recorda: Trabajo solo con nros enteros
        Cuentas disponibles:
         1- SUMA
         2- RESTA
         3- MULTIPLICACION
         4- DIVISION
         5- TODO
        -1- FINALIZAR
        """);

        System.out.println("Ingrese el primer nro: ");
        while (!scanner.hasNextInt()) { //Validar que sea entero
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next(); // descarta el valor inválido
        }
        int numeroUno = scanner.nextInt();

        System.out.println("Ingrese el segundo nro: ");
        while (!scanner.hasNextInt()) { //Validar que sea entero
            System.out.println("Eso no es un número entero. Intente de nuevo:");
            scanner.next(); // descarta el valor inválido
        }

        int numeroDos = scanner.nextInt();
        scanner.nextLine();
        String opcionCuenta;

        do {
            System.out.println("Ingrese el nro de la opción en nro que desea: ");
            opcionCuenta = scanner.nextLine();

            if (opcionCuenta.equals("1")) {
                System.out.println("La SUMA de " + numeroUno + " más " + numeroDos + " es " + sumar(numeroUno,numeroDos));
            } else if (opcionCuenta.equals("2")) {
                System.out.println("La RESTA de " + numeroUno + " menos " + numeroDos + " es " + restar(numeroUno,numeroDos));
            } else if (opcionCuenta.equals("3")) {
                System.out.println("La MULTIPLICACION de " + numeroUno + " por " + numeroDos + " es " + multiplicar(numeroUno,numeroDos));
            } else if (opcionCuenta.equals("4")) {
                if (numeroDos != 0) {
                    System.out.println("La DIVISION de " + numeroUno + " dividido " + numeroDos + " es " + dividir(numeroUno,numeroDos));
                } else {
                    System.out.println("Epa! No se puede dividir por cero!");
                }
            } else if (opcionCuenta.equals("5")){
                System.out.println("""
                    *     Suma: %s
                    *     Resta: %s
                    *     Multiplicación: %s
                    *     División: %s
                """.formatted(
                        sumar(numeroUno, numeroDos),
                        restar(numeroUno, numeroDos),
                        multiplicar(numeroUno, numeroDos),
                        numeroDos != 0 ? dividir(numeroUno, numeroDos) : "No se puede dividir por cero"
                ));
            } else if (opcionCuenta.equals("-1")) {
                System.out.println("Bye bye 👋");
            } else {
                System.out.println("Revise los valores ingresados");
                break;
            }
        } while (!opcionCuenta.equals("-1"));

        scanner.close();

    }

    public static int sumar(int a, int b) {
        int suma = a + b;
        return suma;
    }

    public static int restar(int a, int b) {
        int resta = a - b;
        return resta;
    }

    public static int dividir(int a, int b) {
            int division = a / b;
            return division;
    }

    public static int multiplicar(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }
}
