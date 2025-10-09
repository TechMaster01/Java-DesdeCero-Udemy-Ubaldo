public class TipoVar {
    public static void main(String[] args) {
        System.out.println("*** Uso de var en java ***");

        //Sin uso de var
        String nombre1 = "Juan";

        System.out.println("El nombre es: "+nombre1);

        var nombre2 = "Carlos";

        System.out.println("El nombre es: "+nombre2);

        int a = 12;
        int b = 2;
        final int c = 22;

        int suma = a+b+c;

        System.out.println("La suma es: "+suma);
    }
}
