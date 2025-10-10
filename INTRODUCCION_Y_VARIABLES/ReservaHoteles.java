public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de reserva de hoteles ***");

        // Definir variables
        var nombreCliente = "Miguel flores";
        var diasEstadia = 2;
        var tarifaDiaria = 1345;
        var vistaAlMar = false;
        var tieneVista = "";

        var costoEstadia = diasEstadia * tarifaDiaria;

        if(vistaAlMar == true){
            tieneVista = "su habitación tiene vista al mar";
        } else {
            tieneVista = "su habitación no tiene vista al mar";
        }

        System.out.println("El cliente " + nombreCliente + " se quedara " + diasEstadia + " dias y pagara " + costoEstadia + " y " + tieneVista);
    }
}
