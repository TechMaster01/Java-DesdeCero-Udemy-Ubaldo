package Cadenas;

public class  MasConcatenacionesCadenas {
    public static void main(String[] args) {
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;


        System.out.println("Esta es la cadena 1: " + cadena1);
        System.out.println("Esta es la cadena 2: " + cadena2);
        System.out.println("Esta es la cadena 3: " + cadena3);

        // Metoco concat
        var cadena4 = cadena1.concat(" ").concat(cadena2);

        System.out.println("Esta es la cadena 4: " + cadena4);

        // StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultadoBuilder = constructorCadenas.toString();

        System.out.println("Este es el resultado con String Builder: " + resultadoBuilder);

        // StringBuffer
        var stringBuffer = new StringBuffer();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        var resultadoBuffer = stringBuffer.toString();
        System.out.println("Este es el resultado con String Buffer: " + resultadoBuffer);

        // Join
        var resultadoJoin = String.join(" ", cadena1, cadena2, cadena3);
        System.out.println("Este es el resultado con join: " + resultadoJoin);
    }
}
