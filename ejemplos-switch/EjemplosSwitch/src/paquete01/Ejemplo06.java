/*
*   Ingrese una cadena de texto y verifique que pertenece a un  de un día de la 
*   semana.
 */
package paquete01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.println("Ingrese la placa de su vehiculo");
        String placa = entrada.nextLine();
        placa = placa.toUpperCase();
        String inicial = placa.substring(0,1);
        
        switch(inicial){
            case "G":
                System.out.printf("La placa es correcta", inicial);
                break;
            
            case "P":
                System.out.printf("La placa es correcta", inicial);
                break;    
            
            default:
                System.out.println("Acceso incorrecto");
                break;
        }
        
    }
}
