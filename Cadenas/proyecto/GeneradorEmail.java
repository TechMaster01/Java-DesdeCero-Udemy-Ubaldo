package Cadenas.proyecto;

public class GeneradorEmail {
    public static void main(String[] args) {
        System.out.println("\n*** Generador de emails ***\n");
        var nombre1 = " Mario Evenezer Luna Vargas ";
        var nombre2 = " Ubaldo Acosta Soto ";
        var empresa = "Coppel";
        var dominio = ".com";

        var nombreNormalizado = nombre1.trim().toLowerCase();
        var nombre1Cortado = nombreNormalizado.replace(" ", ".");
        nombreNormalizado = nombre2.trim().toLowerCase();
        var nombre2Cortado = nombreNormalizado.replace(" ", ".");

        var correo1 = nombre1Cortado + "@" + empresa.toLowerCase() + dominio;
        System.out.println("El correo de " + nombre1.trim() + " es: " + correo1);

        var correo2 = nombre2Cortado + "@" + empresa.toLowerCase() + dominio;
        System.out.println("El correo de " + nombre2.trim() + " es: " + correo2);

        System.out.println("\n");
    }
}
