package ENTRADA_DATOS;

import java.util.Scanner;

public class LeerLinea {
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
        System.out.println("El nombre ingresado es: " + nombres + " " + apePaterno + " " + apeMaterno + " y trabaja para " + empresa);
        System.out.println("\n");
        scanner.close();
    }    
}
