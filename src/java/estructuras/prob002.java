
package estructuras;

import java.util.Scanner;

public class prob002 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double Importe;
        System.out.println("Importe: ");
        Importe = Double.valueOf(teclado.nextLine());
        System.out.println("Categoria: ");
        if (Importe>4000){
            System.out.println("D");
        }else if (Importe >2000) {
            System.out.println("C");   
        }else if (Importe > 1000) {
            System.out.println("B");
        } else if (Importe >=0) {
            System.err.println("A");
        }
{
        }
        
        teclado.close();
    }
    }

