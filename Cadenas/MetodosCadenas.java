package Cadenas;
public class MetodosCadenas {
    public static void main(String[] args) {
         var cadena1 = "Hola mundo";

         var longitud = cadena1.length();

         System.out.println("La longitud de la cadena es: " + longitud);

         var nuevaCadena = cadena1.replace("o", "@");

         System.out.println("La nueva cadena es " + nuevaCadena);

         var mayusculas = cadena1.toUpperCase();

         System.out.println("La cadena en mayusculas es " + mayusculas);

         System.out.println("La cadena en minusculas es " + cadena1.toLowerCase());

         var cadena2 = "             mario evenezer          ";

        System.out.println("La cadena con espacios: " + cadena2);
        System.out.println("La cadena sin espacios es: " + cadena2.trim());
    }
}
