
package arreglos;

//Generar la serie fibanacci de todos los números menores a N, 
//y registrarlos en un arreglo
import java.util.Scanner;
import utis.leer;
public class prog107 {
    public static int[] numeros = new int[100];
    public static int cantidad;
    
    public static void figunacci(){
     int a=0, b=0, c=0, fin=0;
        Scanner leer= new Scanner(System.in);
        System.out.println("agrega valores al arreglo: ");
        cantidad=leer.nextInt();
        System.out.println("donde quieres que inicie10: ");
        b=leer.nextInt();
        for (int i = 0; i < cantidad; i++) {
          c=a+b;
          a=b;
          b=c;
            System.out.println("," + c);
        }
        System.out.println("");
    }
    public static void inicio(){
        figunacci();
    }
    public static void main(String[] args) {
        inicio();
    }
    
}
