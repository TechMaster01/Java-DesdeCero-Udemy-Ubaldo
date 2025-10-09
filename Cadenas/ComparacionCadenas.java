package Cadenas;
public class ComparacionCadenas {
    public static void main(String[] args) {
        var cadena1 = "Javacompa";
        var cadena2 = "Java";
        var aux = "compa";
        var cadena3 = new String("Javacompa");

        var cadena4 = cadena2+aux;

        System.out.println("La cadena 1 vale por: " + cadena1);
        System.out.println("La cadena 2 vale por: " + cadena2);
        System.out.println("La cadena 3 vale por: " + cadena3);
        System.out.println("La cadena 4 vale por: " + cadena4);
        System.out.println("El aux vale por: " + aux);

        if(cadena1 == cadena2){
            System.out.println("Las cadenas 1 y 2 son exactamente iguales en referencia a memoria.");
        } else {
            System.out.println("Las cadenas 1 y 2 son distintas en referencia a memoria");
        }

        if(cadena1 == cadena3){
            System.out.println("Las cadenas 1 y 3 son exactamente iguales en referencia a memoria.");
        } else {
            System.out.println("Las cadenas 1 y 3 son distintas en referencia a memoria");
        }

        if(cadena1 == cadena4){
            System.out.println("Las cadenas 1 y 4 son exactamente iguales en referencia a memoria.");
        } else {
            System.out.println("Las cadenas 1 y 4 son distintas en referencia a memoria");
        }

        if(cadena1.equals(cadena2)){
            System.out.println("Las cadenas 1 y 2 son exactamente iguales.");
        } else {
            System.out.println("Las cadenas 1 y 2 son distintas");
        }

        if(cadena1.equals(cadena3)){
            System.out.println("Las cadenas 1 y 3 son exactamente iguales.");
        } else {
            System.out.println("Las cadenas 1 y 3 son distintas");
        }

        if(cadena1.equals(cadena4)){
            System.out.println("Las cadenas 1 y 4 son exactamente iguales.");
        } else {
            System.out.println("Las cadenas 1 y 4 son distintas");
        }
    }
}
