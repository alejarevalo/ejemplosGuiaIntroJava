
package ejemplofuncion;
import java.util.Scanner;
/**
 Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.

a e i o u
@ # $ % *

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación
correspondiente. Utilice la estructura “según” para la transformación.
Por ejemplo, si el usuario ingresa: Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */
public class EjemploFuncion {

    public static void main(String[] args) {//programa principal
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa una frase:");
        String sentence = sc.nextLine().toLowerCase();// Lee y además empleamos método de minusculas para String
        String retorno = codificar(sentence);//Se llama a la función. Asignamos esa función a una variable de retorno.
          
        System.out.println("Codificación: " + retorno);//escritura en pantalla
    }//main end    
    
    public static String codificar(String sentence){//Función
        String code = "";
        for (int i = 0; i < sentence.length(); i++) {
            switch (sentence.charAt(i)) {
                case 'a':
                    code = code.concat("@");
                    break;
                case 'e':
                    code = code.concat("#");
                    break;
                case 'i':
                    code = code.concat("$");
                    break;
                case 'o':
                    code = code.concat("%");
                    break;
                case 'u':
                    code = code.concat("*");
                    break;                
                default:
                    code += sentence.charAt(i);
            }//switch end
        }//for end
        return code;   
    } //function codificar end
}//class end
