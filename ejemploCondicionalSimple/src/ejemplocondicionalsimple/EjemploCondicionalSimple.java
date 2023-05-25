/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package ejemplocondicionalsimple;
import java.util.Scanner;
/**
 *
 * @author user
 */
public class EjemploCondicionalSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número 1: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el número 2:");
        int num2 = sc.nextInt();
        if (num1 != 25 && num2 != 25) {
            System.out.println("Ninguno es igual a 25.");
        }else if(num1 == 25 && num2 != 25){
            System.out.println("El numero 1 es igual a 25");
        }else if(num2 == 25 && num1 != 25){
            System.out.println("El numero 2 es igual a 25");
        } 
        else { System.out.println("Los dos son iguales a 25");
        }
    }
}
    

