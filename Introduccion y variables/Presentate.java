public class Presentate {
    public static void main(String[] args) {
        String nombre = "Mario evenezer";
        Integer edad = 18;
        Double dinero = 500.50;
        Float altura = 1.79F;
        String ciudad = "Culiacan";
        Integer estadoCivil = 4; // 1 - casado 2 -soltero 3 - union libre 4 - concubinato
        boolean disponible = true;
        dinero = dinero + 100.5;

        System.out.println("El individuo se llama " + nombre);

        System.out.println("El individuo tiene " + edad + " años");

        if(edad >= 18){
            System.out.println("El individuo es mayor de edad");
        } else{
            System.out.println("El individuo es menor de edad");
        }

        System.out.println("El individuo tiene una estatura de " + altura + "m");

        System.out.println("El individuo perternece a la ciudad de " + ciudad);

        System.out.println("El individuo cuenta con " + dinero + " pesos en su cuenta de banco");

        switch (estadoCivil) {
            case 1:
                System.out.println("El individuo esta casado");
                break;
            case 2:
                System.out.println("El individuo es soltero");
                break;
            case 3:
                System.out.println("El individuo esta en union libre");
                break;
            case 4:
                System.out.println("El individuo es concubino");
                break;
            default:
                System.out.println("El individuo selecciono una opcion invalida");
                break;
        }

        if(disponible == true){
            System.out.println("El individuo esta disponible");
        } else{
            System.out.println("El individuo no esta disponible");
        }
    }
}
