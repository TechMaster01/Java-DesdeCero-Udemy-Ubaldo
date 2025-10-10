package CADENAS;

public class InmutabilidadCadenas {
    public static void main(String[] args) {
        var cadena1 = "Mario";
        System.out.println("Cadena 1 antes de cambiar de referencia: " + cadena1);

        var cadena2 = cadena1;
        System.out.println("Valor de la cadena 2: " + cadena2);

        cadena1 = "Evenezer";
        System.out.println("Valor de la cadena 1 despues de cambiar de referencia: " + cadena1);
        System.out.println("Valor de la cadena 2 despues de cambiar de referencia: " + cadena2);
    }
}
