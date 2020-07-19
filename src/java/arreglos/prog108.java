
package arreglos;

//Generar la serie fibanacci de todos los números menores a N, 
//y registrarlos en un arreglo
import java.util.ArrayList;
import utis.leer;
import java.util.Scanner;
public class prog108 {
  public static ArrayList<Integer> listaEnteros = new ArrayList<>();
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
       System.out.println("LLENE EL ARREGLO DE ENTEROS");
       int ultimoV=-1;
       while(ultimoV!=0){
          System.out.println("DIGITE UN NÚMERO, 0 PARA SALIR DEL LLENADO : ");
          ultimoV=scan.nextInt();
          listaEnteros.add(ultimoV); 
       }
       System.out.println("DIGITE UN NUMERO A BUSCAR :");
       ultimoV=scan.nextInt();
       int cant=0;
       for(int i=0;i<listaEnteros.size();i++){
           if(ultimoV==listaEnteros.get(i)){
               cant++;
           }
       }
       System.out.println("EL NÚMERO A BUSCAR FUE : "+ultimoV);
       System.out.println("SE ENCONTRARON : "+cant+" VECES");
    }
}
