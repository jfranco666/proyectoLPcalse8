
package modularidad;
//autor: jean retamozo
public class prog010 {
 // metodo que reciben paramentros y devuelven valores
    public static int factorial(int numero){
        int fac = 1;
        for (int i = 1; i <=numero; i++) {
            fac*=i;
        }
        return fac;
    }
    public static void main(String[] args){
        System.out.println(factorial(8));
    }
}

