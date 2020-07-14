
package arreglos;

//eliminar elementos de un arreglo
import utis.leer;

public class prog105 {
     public static int[] numeros = new int[100];
    public static int cantidad;

    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = leer.entero();
        } 
    }
    public static void eliminarelemento(){
        int posicion;
        listararreglo();
        System.out.print("Indique la posicion a eliminar: ");
        posicion = leer.entero();
        for (int i = posicion; i < cantidad-1; i++) {
            numeros[i] = numeros[i+1];
        }
        numeros[cantidad-1] = 0;
        cantidad--;
    }
    public static void listararreglo(){
        System.out.println("Valores del arreglo");
        for (int i = 0; i < cantidad; i++) {
            System.out.println("numero[ " +i + " ]: " + numeros[i]);                            
        }
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = leer.entero();
        escribirarreglo();
        eliminarelemento();
        listararreglo();
    }
    public static void main(String[] args) {
        inicio();
    }
}
