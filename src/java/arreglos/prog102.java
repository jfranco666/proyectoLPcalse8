
package arreglos;

//desarrollar un programa que permita el ingreso de valores
//a un arreglo y muestre la sumatoria de sus elementos
import utis.leer;

public class prog102 {
    public static int[] numeros = new int [1000];
    public static int cantidad;
    public static void escribirarreglos(){
        System.out.println("agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numeros[ " + i + "]: ");
            numeros[i] = leer.entero();
        }
        
    }
    public static void sumatoria(){
        int suma = 0;
        for (int i = 0; i < cantidad; i++) {
            suma+= numeros[i];
            
        }
        System.out.println("resultado(sumatoria):" + suma);
    }
    public static void inicio(){
        System.out.println("cantidad: ");
        cantidad = leer.entero();
        escribirarreglos();
        sumatoria();
        
    }
    public static void main(String[] args) {
        
        inicio();
    }
}
