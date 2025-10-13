package ENTRADA_DATOS.proyectos;

import java.util.Scanner;

public class generadorCorreos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa tu nombres: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingresa tu apellido paterno: ");
        String apePaterno = scanner.nextLine();
        System.out.print("Ingresa tu apellido materno: ");
        String apeMaterno = scanner.nextLine();
        System.out.print("Ingresa la empresa en la que trabajas: ");
        String empresa = scanner.nextLine();

        System.out.println("\n");
        System.out.println("El nombre ingresado es: " + nombres.trim().toLowerCase() + " " + apePaterno.trim().toLowerCase() + " " + apeMaterno.trim().toLowerCase() + " y trabaja para " + empresa.trim().toLowerCase());
        System.out.println("\n");

        // Encontrar el primer nombre
        int primerEspacio = nombres.indexOf(" ");

        String primerNombre;

        if(primerEspacio > 0){
            primerNombre = nombres.substring(0, primerEspacio);
        } else {
            primerNombre = nombres;
        }

        String dominio = ".com";
        String correo = primerNombre.trim().toLowerCase() + "." + apePaterno.trim().toLowerCase() + "@" + empresa.trim().toLowerCase() + dominio;

        System.out.println("\n");
        System.out.println("El correo generado para esa persona es: " + correo);
        System.out.println("\n");
        System.out.println("\n");
        scanner.close();
    }
}