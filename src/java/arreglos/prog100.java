
package arreglos;
//utilizando metodos, diseñe un programa que permite el ingreso
//de valores a un arreglo y los muestre
//valores del arreglo 10,1,-5,60,1
import java.util.Scanner;
import utis.leer;
public class prog100 {
 
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float numeros[] = new float[5];
        
        System.out.println("guardar los datos en el arreglo");
        for(int i=0;i<5;i++){
            System.out.print((i+1)+". digite un numero: ");
            numeros[i] = entrada.nextFloat();
            
        }
    }
}
