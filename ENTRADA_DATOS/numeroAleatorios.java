package ENTRADA_DATOS;

import java.util.Random;

public class numeroAleatorios {
    public static void main(String[] args) {
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Genera un número aleatorio entre 1 y 100
        System.out.println("Número aleatorio generado: " + numeroAleatorio);
    }
}
