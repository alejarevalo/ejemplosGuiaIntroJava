
package ejemplofor;
import java.util.Scanner;
/**
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
public class EjemploFor {
  
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int num;
        for (int i = 0; i < 4; i++) {//bucle principal que cuenta hasta 4 números ingresados
          System.out.println("Ingresa un número:");
          num = sc.nextInt();
          System.out.print(num + " ");
            for (int j = 0; j < num; j++) {//bucle anidado para imprimir los asteriscos según el num ingresado                
                System.out.print("*");                
            }
            System.out.println(""); // salto de linea para separar los asteriscos de "ingresa un número"
        }                
    }//main end    
}// class end
