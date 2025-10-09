public class TipoDatos {
    public static void main(String[] args) {
        //Tipos de datos
        //Enteros
        byte tipoByte = 127;
        System.out.println("Tipo byte = " + tipoByte);

        short tipoShort = 32767;
        System.out.println("Tipo short = " + tipoShort);

        int tipoInt = 2147483647;
        System.out.println("Tipo int = " + tipoInt);

        long tipoLong = 987654321098765432L;
        System.out.println("Tipo long = " + tipoLong);

        // Punto Flotante
        float tipoFloat = 3.14F;
        System.out.println("Tipo flotante = " + tipoFloat);

        Double tipoDouble = 3.1315D;
        System.out.println("Tipo double = " + tipoDouble);

        // Caracter
        char tipoChar = 'M';
        System.out.println("Tipo char = " + tipoChar);
        tipoChar = 92;
        System.out.println("Tipo char = " + tipoChar);

        // String
        String tipoString = "Cadena de texto";
        System.out.println("Tipo string = " + tipoString);
        tipoString = "Cadena de texto modificada";
        System.out.println("Tipo string = " + tipoString);

        // Booleano
        boolean tipoBoolean = false;
        System.out.println("Tipo boolean = " + tipoBoolean);
        tipoBoolean = true;
        System.out.println("Tipo boolean = " + tipoBoolean);
    }
}
