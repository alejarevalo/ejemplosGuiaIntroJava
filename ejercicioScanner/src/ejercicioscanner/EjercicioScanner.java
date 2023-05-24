/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioscanner;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EjercicioScanner {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Vamos a ingresar unos datos.");
        System.out.println("Ingresa un booleano");
        boolean esCierto = leer.nextBoolean();
        System.out.println("Ingresa un caracter");
        char letra = leer.next().charAt(0);
        System.out.println("Ingresa un decimal");
        double numDecimal = leer.nextDouble();
        
        System.out.println("Tu letra es: " + letra + " y tu numero es: " + numDecimal);
        System.out.println("Y el booleano es: " + esCierto);

        
        
        
    }
    
}
