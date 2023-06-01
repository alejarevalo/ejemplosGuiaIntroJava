package ejemplovector;
import java.util.Scanner;
/**
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
public class EjemploVector {

    public static void main(String[] args) {
     
        Scanner leer = new Scanner(System.in);
        String[] equipo = new String[5];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingresa el nombre de tu compañero " + i);
            equipo[i] = leer.nextLine();
        }//for end
        
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + equipo[i] + "]");// le quito line para que imprima sin saltar
        }
        System.out.println(" ");
    }//Fin main
    
}//Fin Classe
