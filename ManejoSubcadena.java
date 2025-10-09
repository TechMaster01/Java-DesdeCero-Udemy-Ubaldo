public class ManejoSubcadena {
    public static void main(String[] args) {
        var cadena1 = "Hola mundo";

        System.out.println(cadena1);

        var subcadena1 = cadena1.substring(0, 4);

        System.out.println(subcadena1);

        var subcadena2 = cadena1.substring(5, 10);

        System.out.println(subcadena2);
    }
}
