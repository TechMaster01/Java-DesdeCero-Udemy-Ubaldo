package ENTRADA_DATOS.proyectos;

import java.util.Random;
import java.util.Scanner;

public class adivinaNumero {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = random.nextInt(100) + 1; // Número secreto entre 1 y 100
        int intentos = 0;
        int maxIntentos = 10;

        System.out.println("¡Bienvenido al juego de Adivina el Número!");
        System.out.println("Tienes " + maxIntentos + " intentos para adivinar el número entre 1 y 100.");
        System.out.println("--------------------------------------------------");
        System.out.println("\n");

        while (intentos < maxIntentos) {
            System.out.print("Este es tu intento número " + (intentos + 1) + ". Ingresa tu suposición: ");
            int suposicion = scanner.nextInt();
            intentos++;

            if (suposicion < numeroSecreto) {
                System.out.println("Demasiado bajo. Intenta de nuevo.");
            } else if (suposicion > numeroSecreto) {
                System.out.println("Demasiado alto. Intenta de nuevo.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número " + numeroSecreto + " en " + intentos + " intentos.");
                break;
            }
        }

        if (intentos == maxIntentos) {
            System.out.println("Lo siento, has agotado tus intentos. El número secreto era " + numeroSecreto + ".");
        }
        scanner.close();
    }
}
