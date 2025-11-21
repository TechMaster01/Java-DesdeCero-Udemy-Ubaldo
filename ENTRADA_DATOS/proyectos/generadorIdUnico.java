package ENTRADA_DATOS.proyectos;

import java.util.Random;
import java.util.Scanner;

public class generadorIdUnico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String idUnico = "";

        System.out.print("Ingrese sus nombres: ");
        String nombres = scanner.nextLine();

        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        System.out.print("Ingrese su año de nacimiento (formato: AAAA): ");
        String anioNacimiento = scanner.nextLine();

        // Generar ID único
        int id = random.nextInt(9999);
        idUnico = Integer.toString(id);

        if(idUnico.length() < 4) {
            idUnico = String.format("%04d", id);
        }

        StringBuilder idUnicoBuilder = new StringBuilder(idUnico);

        idUnicoBuilder.insert(0, anioNacimiento.substring(2, 4).toLowerCase());
        idUnicoBuilder.insert(0, apellidoMaterno.substring(0, 2).toLowerCase());
        idUnicoBuilder.insert(0, apellidoPaterno.substring(0, 2).toLowerCase());
        idUnicoBuilder.insert(0, nombres.substring(0, 2).toLowerCase());

        System.out.println("\nSu ID único generado es: " + idUnico);

        System.out.println("\n");

        System.out.println("El id unico completo es: " + idUnicoBuilder.toString());

        scanner.close();
    }
}
