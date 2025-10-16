package ENTRADA_DATOS.proyectos;

import java.util.Scanner;

public class generadorCorreos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nombres, apePaterno, apeMaterno, empresa;

        // Bucle do-while para solicitar y validar nombres
        do {
            System.out.print("Ingresa tu nombres: ");
            nombres = scanner.nextLine().trim();
            // La expresión regular [^a-zA-ZáéíóúÁÉÍÓÚñÑ\s] busca cualquier caracter que NO sea una letra (con o sin acento, o 'ñ') o un espacio.
            if (nombres.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || nombres.isEmpty()) {
                System.out.println("Error: El nombre solo puede contener letras y espacios y no debe estar vacío. Intenta de nuevo.");
            }
        } while (nombres.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || nombres.isEmpty());

        // Bucle para solicitar y validar apellido paterno
        do {
            System.out.print("Ingresa tu apellido paterno: ");
            apePaterno = scanner.nextLine().trim();
            if (apePaterno.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || apePaterno.isEmpty()) {
                System.out.println("Error: El apellido paterno solo puede contener letras y espacios y no debe estar vacío. Intenta de nuevo.");
            }
        } while (apePaterno.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || apePaterno.isEmpty());

        // Bucle para solicitar y validar apellido materno
        do {
            System.out.print("Ingresa tu apellido materno: ");
            apeMaterno = scanner.nextLine().trim();
            if (apeMaterno.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || apeMaterno.isEmpty()) {
                System.out.println("Error: El apellido materno solo puede contener letras y espacios y no debe estar vacío. Intenta de nuevo.");
            }
        } while (apeMaterno.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ\\s].*") || apeMaterno.isEmpty());

        // Bucle para solicitar y validar nombre de la empresa
        do {
            System.out.print("Ingresa la empresa en la que trabajas: ");
            empresa = scanner.nextLine().trim();
            if (empresa.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ0-9\\s].*") || empresa.isEmpty()) {
                System.out.println("Error: El nombre de la empresa solo puede contener letras, números y espacios y no debe estar vacío. Intenta de nuevo.");
            }
        } while (empresa.matches(".*[^a-zA-ZáéíóúÁÉÍÓÚñÑ0-9\\s].*") || empresa.isEmpty());

        System.out.println("\n");
        System.out.println("El nombre ingresado es: " + nombres.toLowerCase() + " " + apePaterno.toLowerCase() + " " + apeMaterno.toLowerCase() + " y trabaja para " + empresa.toLowerCase());
        System.out.println("\n");

        int primerEspacio = nombres.indexOf(" ");

        String primerNombre;

        if(primerEspacio > 0){
            primerNombre = nombres.substring(0, primerEspacio);
        } else {
            primerNombre = nombres;
        }

        String dominio = ".com";
        String correo = primerNombre.toLowerCase() + "." + apePaterno.toLowerCase().replaceAll("\\s", "") + "@" + empresa.toLowerCase().replaceAll("\\s", "") + dominio;

        System.out.println("\n");
        System.out.println("El correo generado para esa persona es: " + correo);
        System.out.println("\n");
        System.out.println("\n");
        scanner.close();
    }
}