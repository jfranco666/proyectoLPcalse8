
package estructuras;

import java.util.Scanner;

public class prob001 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
       
        int n;
       
        System.out.print("Por favor ingrese el número a evaluar: ");
        n = teclado.nextInt();
       
        if(n % 2 == 0) {
            System.out.println(n+" es un número par.");
        }else {
            System.out.println(n+" no es un número par.");
        }
    }
 
}
