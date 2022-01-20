package ejer1;
import numeros.Numeros;

/**
 *
 * @author Daniel Miranda Pérez
 */

public class Ejer1 {

    public static void main(String[] args) {
        int nPlazas = Numeros.pedirNumero("Introduce el numero de plazas: ", 1);
        Parking miParking = new Parking(nPlazas);
        miParking.inicializarParking();
        miParking.menu();
    }
}
