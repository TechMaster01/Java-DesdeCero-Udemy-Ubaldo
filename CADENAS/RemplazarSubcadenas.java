package CADENAS;

public class RemplazarSubcadenas {
    public static void main(String[] args) {
        var cadena = "Hola mundo";
        System.out.println("Cadena original: " + cadena);

        var nuevaCadena = cadena.replace("mundo", "perrita");
        System.out.println("Nueva cadena: " + nuevaCadena);

        nuevaCadena = nuevaCadena.replace("Hola", "Eres una");
        System.out.println("Nueva cadena: " + nuevaCadena);
    }
}
