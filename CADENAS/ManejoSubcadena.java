package CADENAS;

public class ManejoSubcadena {
    public static void main(String[] args) {
        var cadena1 = "Hola Mundo Hola Mundo";

        System.out.println(cadena1);

        var subcadena1 = cadena1.substring(0, 4);

        System.out.println(subcadena1);

        var subcadena2 = cadena1.substring(5, 10);

        System.out.println(subcadena2);

        var indice1 = "Hola";
        var indice2 = "Mundo";
        var indice3 = "Java";

        System.out.println();
        System.out.println();

        System.out.println("El indice inicial de 'Hola' es: " + cadena1.indexOf(indice1));
        System.out.println("El indice inicial de 'Mundo' es: " + cadena1.indexOf(indice2));
        System.out.println("El indice inicial de 'Java' es: " + cadena1.indexOf(indice3));

        System.out.println();
        System.out.println();

        System.out.println("El indice final de 'Hola' es: " + cadena1.lastIndexOf(indice1));
        System.out.println("El indice final de 'Mundo' es: " + cadena1.lastIndexOf(indice2));
        System.out.println("El indice final de 'Java' es: " + cadena1.lastIndexOf(indice3));

        System.out.println();
        System.out.println();
    }
}
