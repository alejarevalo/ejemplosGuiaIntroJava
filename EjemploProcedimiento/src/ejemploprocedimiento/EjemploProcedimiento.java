package ejemploprocedimiento;
import java.util.Scanner;
/**
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero es múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
public class EjemploProcedimiento {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingresa el primer número:");
        int num1 = leer.nextInt();
        System.out.println("Ingresa el segundo número:");
        int num2 = leer.nextInt();
        esMultiplo(num1, num2);
                
    }//fin main

    public static void esMultiplo (int num1, int num2){
        if (num1 % num2 == 0){
            System.out.println("El número " + num1 + " es múltiplo del número " + num2);
        }else{
            System.out.println("El número " + num1 + "  NO es múltiplo del número " + num2);
        }

    }// fin procedimiento
    

}// fin clase
