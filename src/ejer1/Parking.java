package ejer1;
import numeros.Numeros;

/**
 *
 * @author Daniel Miranda Pérez
 */

public class Parking {
    String [] parking;
    
    /**
     * Inicializamos el array al numero de plazas que introduzcamos por teclado
     * @param nPlazas Recibira el numero de plazas que hayamos introducido
     */
    
    public Parking(int nPlazas){
        parking = new String[nPlazas];
    }
    
    /**
     * Metodo para que nos incialize todas las plazas a libre
     */
    
    public void inicializarParking(){
        for (int i = 0; i<parking.length; i++){
            parking[i] = "Libre";
            System.out.println("La plaza: " + i + " se encuentra libre");
        }
    }
    
    /**
     * Con este metodo simplemente estamos visualizando si la plaza esta ocupada o libre
     */
    
    public void estadoParking(){
        for (int i = 0; i<parking.length; i++){
            System.out.println("La plaza: " + i + " se encuentra " + parking[i]);
        }
    }
    
    public void insertarVehiculo(){
        int i = 0;
        boolean encontrado = false;
        
        while (!encontrado && i<parking.length){ // 
            if (parking[i] == "Libre"){
                encontrado = true;
            }else{
                i++;
            }
        }
        
        if (encontrado) {
            parking[i] = "Ocupado";
            System.out.println("La plaza asignada es: " + i);
        } else {
            System.out.println("Parking completo");
        }
    }
    
    public void sacarVehiculo(){
        int nPlaza = Numeros.pedirNumero("Introduce el numero de la plaza que quieres dejar libre: ", 0, parking.length-1);
        
        if(parking[nPlaza] == "Ocupado"){
            parking[nPlaza] = "Libre";
            System.out.println("La plaza: " + nPlaza + " ha quedado libre");
        }else{
            System.out.println("La plaza ya esta libre");
        }
    }
    
    public void menu(){
        System.out.println("MENÚ PRINCIPAL");
        System.out.println("1) Entrada");
        System.out.println("2) Salida");
        System.out.println("3) Estado");
        System.out.println("4) Fin");
        
        int opcion = Numeros.pedirNumero("Introduce un numero del 1 - 4:", 1, 4);
        
        while(opcion!=4){
            switch(opcion){
                case 1:
                    insertarVehiculo();
                    break;
                case 2:
                    sacarVehiculo();
                    break;
                case 3:
                    estadoParking();
            }
            opcion = Numeros.pedirNumero("Introduce un numero del 1 - 4:", 1, 4);
        }
    }
}
