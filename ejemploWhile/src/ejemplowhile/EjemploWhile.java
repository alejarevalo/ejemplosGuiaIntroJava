 
package ejemplowhile;
import java.util.Scanner;
/**
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
public class EjemploWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int grade;
        System.out.println("Ingresa una nota entre 0 y 10.");
        grade = sc.nextInt();
        
        while (grade < 0 || grade > 10 ) {
            System.out.println("Nota fuera de rango. Ingrese una nota válida."); 
            grade = sc.nextInt();
        }
    }// main end
    
}//class end
