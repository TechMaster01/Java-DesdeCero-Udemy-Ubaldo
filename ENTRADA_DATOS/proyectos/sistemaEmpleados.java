package ENTRADA_DATOS.proyectos;

import java.util.Scanner;

public class sistemaEmpleados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de empleados");
        System.out.println("-------------------");
        System.out.println("\n");

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese la edad del empleado: ");
        int edad = scanner.nextInt();

        System.out.print("Ingrese el salario del empleado: ");
        double salario = scanner.nextDouble();

        System.out.print("Ingrese los años de experiencia del empleado: ");
        int experiencia = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("¿Es jefe de departamento? (si/no): ");
        String esJefe = scanner.nextLine();

        System.out.println("\nResumen del empleado:");
        System.out.println("\tNombre: " + nombre.toLowerCase());
        System.out.println("\tEdad: " + edad + " años");
        System.out.printf("\tSalario: $%.2f%n", salario);
        System.out.println("\tAños de experiencia: " + experiencia + " años");
        
        if(esJefe.equalsIgnoreCase("si")) {
            System.out.println("\tPosición: Jefe de departamento");
        } else if (esJefe.equalsIgnoreCase("no")) {
            System.out.println("\tPosición: Empleado regular");
        } else {
            System.out.println("\tPosición: Sin respuesta válida");
        }

        scanner.close();
    }
}
