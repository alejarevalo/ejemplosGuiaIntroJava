/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otroejemplovectorr;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class OtroEjemploVectorr {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int[] neftali = new int[5];
    
        for (int i = 0; i < 5; i++){
        neftali[i] = i + 2;
        }//fin for
        
        for (int i = 0; i < 5; i++) {
            System.out.print("[" + neftali[i] + "]");
        }
        System.out.println(" → Neftali");
        System.out.println("");
    }//fin metodo
}//fin clase
