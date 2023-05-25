
package ejemplodowhile;
import java.util.Scanner;
/**
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
public class EjemploDoWhile {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 0;
        int sum = 0;
        int num;    
        do {            
            System.out.println("Ingresa un numero");
            num = sc.nextInt();
            if (num == 0) {
                System.out.println("Hemos capturado el 0");
                break;
            }else if(num > 0){
                sum += num; // Se utilizó el operador de asignación compuesta += para simplificar la suma = suma+num
            }
            i++;    
        } while (i < 20);
                
        System.out.println("La suma de los números es: " + sum);
       
    }//main end
}//class end
