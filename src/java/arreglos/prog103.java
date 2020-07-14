
package arreglos;

//desarrollar un programa que permite el ingreso de valores
//a un arreglo y muestre el factorial de cada elemento, utilice metodos
import utis.leer;
public class prog103 {
    public static int[] numeros = new int[1000];
    public static int cantidad;

    public static void escribirarreglo(){
        System.out.println("Agregar valores al arreglo: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("numeros[ " + i + " ]: ");
            numeros[i] = leer.entero();
        }
    }
    public static int factorial(int numero){
        int fac = 1;
        for (int i = 1; i <= numero; i++) {
            fac*=i;
        }
        return fac;
    }
    public static void imprimirfactorial(){
        System.out.println("Resultado: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i] + "!: " + factorial(numeros[i]));
        }
    }
    public static void inicio(){
        System.out.print("cantidad: ");
        cantidad = leer.entero();
        escribirarreglo();
        imprimirfactorial();

    }
    public static void main(String[] args) {
        inicio();
    }
}