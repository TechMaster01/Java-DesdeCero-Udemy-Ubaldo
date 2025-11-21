package ENTRADA_DATOS;

import java.util.Scanner;

public class conversionDatos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Conversion de datos en Java");
        System.out.println("---------------------------");
        System.out.println("\n");

        // Conversion de datos
        System.out.println("Proporciona un valor entero: ");
        var valorEntero = scanner.nextLine();
        System.out.println("El valor proporcionado es: " + valorEntero);
        var entero = Integer.parseInt(valorEntero);
        System.out.println("El valor entero es: " + entero);

        System.out.println("\n");

        // Conversion de datos a decimal
        System.out.println("Proporciona un valor decimal: ");
        /* var valorDecimal = scanner.nextLine();
        System.out.println("El valor proporcionado es: " + valorDecimal); */
        var decimal = Float.parseFloat(scanner.nextLine());
        System.out.println("El valor decimal es: " + decimal);
        scanner.close();
    }
}
