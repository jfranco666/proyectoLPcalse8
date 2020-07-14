
package arreglos;
// diseñar un algoritmo que permite el ingreso de 7
// valores a un arreglo y mostrarlos
//autor: JFranco
import java.util.Scanner;
import utis.leer;
public class prog099 {
    public static void inicio(){
        int[] a = new int[7];
        System.out.println("tamaño de arreglo: " + a.length);
        System.out.println("ingresar elementos: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print("a[ "+i+" ]: "); 
            a[i] = leer.entero();
        }
         System.out.println("los elementos del arreglo son: ");
         for (int i = 0; i < a.length; i++) {
             System.out.println("a["+i+"]: " +a[i]);
        }
        }
        
    public static void main(String[] args) {
       inicio(); 
    }
}


   
        