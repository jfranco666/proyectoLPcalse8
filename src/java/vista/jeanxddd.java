
package vista;
import java.util.Scanner;
import utis.leer;
public class jeanxddd {
   public static void suma(){
    System.out.println("*** SUMA ***");  
    double num1, num2, resultado;
    Scanner teclado = new Scanner(System.in);
       System.out.println("inserte el numero 1: ");
       num1=teclado.nextDouble();
       System.out.println("inserte el numero 2: ");
       num2=teclado.nextDouble();
       resultado=num1+num2;
       System.out.println("El resultado es: "+resultado);
   }
   public static void factorial(){
    System.out.println("*** FACTORIAL ***");
        System.out.print("Ingrese el Numero: ");
        int numero =leer.entero();
        int fac =1;
        for (int i = 0; i <=numero; i++) {
           fac*=i;
        }
        System.out.println(numero + "! = " + fac);   
   }
   public static void radical(){
        System.out.println("*** RADICAL ***");
       double numero, raiz;
       System.out.println("Ingrese el Numero: ");
       Scanner cap = new Scanner(System.in);
       numero = cap.nextDouble();
       raiz = Math.sqrt(numero);
       System.out.println("La raiz cuadra de "+numero+" es "+raiz);
   }
   public static void primo(){
        System.out.print("Ingrese un número: ");
        int numero, c=0;
        numero = leer.entero();
        for(int i=1; i<=numero; i++){
            if(numero%i==0){
                c++;
            }
        }
        if( c==2 ){
            System.out.println("El número "+numero+" es primo");
        }
        else{
            System.out.println("El número "+numero+" no es primo");
        }
    }
   public static void error(){
        System.out.println("Error. Opcion incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL"); 
        System.out.println("1. suma");
        System.out.println("2. factorial");
        System.out.println("3. radical");
        System.out.println("4. Primo");
        System.out.println("5. Salir");
        System.out.print("Ingrese opcion [1-5]");
    }
    public static void inicio(){
       int opcion;
       do{
           menu();
           opcion = leer.entero();
           switch(opcion){
               case 1: suma();
               break;
               case 2: factorial();
               break;
               case 3: radical();
               break;
               case 4: primo();
               break;
               case 5: salir();
               break;
               default:error();
           }
       }while(opcion!=5);
    }
    //metodo principal
    public static void main(String[] args) {
        inicio();
    }
}
