package ENTRADA_DATOS;

import java.util.Scanner;

public class formateoCadenas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre completo: ");
        String nombreCompleto = scanner.nextLine();

        System.out.print("Ingrese su numero de empleado:  ");
        String numeroEmpleado = scanner.nextLine();

        System.out.print("Edad: ");
        int edad = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        var mensaje = String.format("Hola, %s, numero de empleado %s. Tienes %d años y tu salario es de $%.2f.", nombreCompleto, numeroEmpleado, edad, salario);

        System.out.println(mensaje);
        System.out.println("\nResumen de la información ingresada:");
        System.out.println("Nombre ingresado: " + nombreCompleto);
        System.out.println("Número de empleado ingresado: " + numeroEmpleado);
        System.out.println("Edad ingresada: " + edad + " años");
        System.out.printf("Salario ingresado: $%.2f%n", salario);


        // Cadenas multilinea
        System.out.println("\nUsando cadenas multilínea:");
        System.out.println("-----------------------------------");
        System.out.print("\n");

        System.out.println("Formateado con cadenas multilínea:");
        mensaje = """
                Hola, %s.
                Número de empleado %s.
                Tienes %d años
                y tu salario es de $%.2f.
                """.formatted(nombreCompleto, numeroEmpleado, edad, salario);

        System.out.print(mensaje);

        // Usando printf con cadenas multilínea
        System.out.println("\n-----------------------------------");
        System.out.println("Formateado con cadenas multilínea en función de impresión: ");

        System.out.printf("""
                Hola, %s.
                Número de empleado %s.
                Tienes %d años
                y tu salario es de $%.2f.
                """, nombreCompleto, numeroEmpleado, edad, salario);

        scanner.close();
    }
}
