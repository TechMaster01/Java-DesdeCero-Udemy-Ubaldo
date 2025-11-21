package ENTRADA_DATOS.proyectos;

import java.util.Scanner;
import java.util.Random;

public class generadorRFC {
    public static void main(String[] args) {
        System.out.println("\n");
        System.out.println("\n");
        System.out.println("Generador de RFC");
        System.out.println("------------------");
        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Ingrese su nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese su apellido paterno: ");
        String apellidoPaterno = scanner.nextLine();

        System.out.print("Ingrese su apellido materno: ");
        String apellidoMaterno = scanner.nextLine();

        System.out.print("Ingrese su año de nacimiento (formato: AAAA): ");
        String anioNacimiento = scanner.nextLine();

        System.out.print("Ingrese su mes de nacimiento (formato: MM): ");
        String mesNacimiento = scanner.nextLine();

        System.out.print("Ingrese su día de nacimiento (formato: DD): ");
        String diaNacimiento = scanner.nextLine();

        char letra = (char) (random.nextInt(26) + 'A');
        int numero = random.nextInt(100);
        String numeroFormateado = String.format("%02d", numero);

        String homoclave = "" + letra + numeroFormateado;

        StringBuilder rfcBuilder = new StringBuilder();
        rfcBuilder.append(apellidoPaterno.substring(0, 2).toUpperCase());
        rfcBuilder.append(apellidoMaterno.substring(0, 1).toUpperCase());
        rfcBuilder.append(nombre.substring(0, 1).toUpperCase());
        rfcBuilder.append(anioNacimiento.substring(2, 4));
        rfcBuilder.append(mesNacimiento);
        rfcBuilder.append(diaNacimiento);

        String rfc = rfcBuilder.toString();
        System.out.println("RFC sin homoclave: " + rfc);
        System.out.println("Homoclave: " + homoclave);
        System.out.println("\n");
        System.out.println("RFC generado: " + rfc + homoclave);

        scanner.close();
    }
}
