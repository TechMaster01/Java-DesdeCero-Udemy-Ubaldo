package Cadenas;

public class CaracteresEspeciales {
    public static void main(String[] args) {
        // Caracteres especiales
        // \n - imprimir salto de linea
        var cadena1 = "\nHola mundo";
        System.out.println("Cadena 1 = " + cadena1);

        // \t - tabulador
        var cadena2 = "\t Hola \t mundo";
        System.out.println("Cadena2 = " + cadena2);

        // \" - Agrega comilla doble
        var cadena3 = "\"Hola\" mundo";
        System.out.println("Cadena3 = " + cadena3);

        // \' - Agrega comilla simple
        var cadena4 = "\'Hola\' mundo";
        System.out.println("Cadena4 = " + cadena4);

        // \\ - caracter de diagonal invertida
        var cadena5 = "Hola \\ mundo";
        System.out.println("Cadena 5 = " + cadena5);
    }
}
