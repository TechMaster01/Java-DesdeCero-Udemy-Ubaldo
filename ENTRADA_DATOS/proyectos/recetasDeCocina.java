package ENTRADA_DATOS.proyectos;

import java.util.Scanner;

public class recetasDeCocina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Receta de Cocina: Panqueques");
        System.out.println("----------------------------");
        System.out.println("\n");

        System.out.print("Nombre de la receta: ");
        String nombreReceta = scanner.nextLine();

        System.out.print("Ingredientes necesarios (separados por comas): ");
        String ingredientes = scanner.nextLine();

        System.out.print("Tiempo de preparación (en minutos): ");
        int tiempoPreparacion = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente

        System.out.print("Dificultad de la receta (fácil, media, difícil): ");
        String dificultad = scanner.nextLine();

        System.out.println("\nResumen de la receta:");
        System.out.println("\tNombre: " + nombreReceta);
        System.out.println("\tIngredientes: " + ingredientes);
        System.out.println("\tTiempo de preparación: " + tiempoPreparacion + " minutos");
        System.out.println("\tDificultad: " + dificultad);

        scanner.close();
    }
}
