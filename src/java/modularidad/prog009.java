
package modularidad;

//autor: jean retamozo

public class prog009 {
   //metodo que devuelven valores
    public static String universidad(){
       String universidad="universidad nacional tegnologica de lima sur";
       return universidad;
       
    }
    public static void main(String[] args) {
        System.out.println(universidad());
        System.out.println(universidad().toUpperCase());
    }
}
