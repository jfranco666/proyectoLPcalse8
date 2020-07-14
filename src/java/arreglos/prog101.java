
package arreglos;
//utilizando metodos, diseñe un programa que permite el ingreso
//de valores a un arreglo y los muestre
//valores del arreglo 10,1,-5,60,1
import utis.leer;
public class prog101 {
    public static int[] numeros = new int[1000];
    public static int cantidad;
    
    public static void escribirarreglo(){
        System.out.println("agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numero[ " + i + "]: ");
            numeros[i] = leer.entero();
        }
        
    }
    public static void imprimirarreglo(){
        System.out.println("valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[ " + i + "]: ");
            
        }
        
    }
    public static void inicio(){
        System.out.print("cantidad de elementos: ");
        cantidad = leer.entero();
        escribirarreglo();
        imprimirarreglo();
        
    }
    public static void main(String[] args) {
        inicio();
    }
}
