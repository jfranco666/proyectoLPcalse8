package arreglos;
import utis.leer;
/*
BIBLIOTECA
- Nombre del libro
- codigo del libro
- Fecha de devolucion

MENU PRINCIPAL
1. Agregar libros a llevar
2. Eliminar libros de que llevas
3. Editar libros no deseados
4. Listar libros a llevar
5. Salir
*/
public class tareaCrud {
    public static String[] nombre = new String[1000];
    public static String[] codigo = new String[1000];
    public static String[] fdevolucion = new String[1000];
    public static int estado = -1;
    
    public static void agregarlibros(){
            String continuar;
        do {
            estado++;
            System.out.println("Agregar libros");
            System.out.println("Nombre del libro: ");
            nombre[estado]= leer.cadena();
            System.out.println("codigo del libro: ");
            codigo[estado]= leer.cadena();
            System.out.println("Fecha de devolucion: ");
            fdevolucion[estado]= leer.cadena();
            System.out.println("¿Deseas agregar otro libro [S/N]?");
            continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void eliminarlibros(){
            String continuar;
        do{
            listarlibros();
            System.out.println("Ingrese el numero de libro que desea eliminar: ");
            int numero = leer.entero();
             numero--;
            for (int i = numero; i < estado; i++) {
            nombre[i] = nombre[i+1];
            codigo[i] = codigo[i+1];
            fdevolucion[i] = fdevolucion[i+1];
            }
            nombre[estado] ="";
            codigo[estado] ="";
            fdevolucion[estado]="";
            estado--;
            System.out.println("¿Deseas eliminar otro libro [S/N]?");
            continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void editarlibros(){
            String continuar;
        do{
            listarlibros();
            System.out.println("Ingrese el numero de los libros a editar: ");
            int numero = leer.entero();
            numero--;
            System.out.println("Resultado: " + nombre[numero] + "(" + codigo[numero] + " ) - " + fdevolucion[numero]);
            System.out.print("Nuevo nombre: ");
            nombre[numero] = leer.cadena();
            System.out.print("Nuevo codigo de libro: ");
            codigo[numero] = leer.cadena();
            System.out.print("Nueva fecha de devolucion: ");
            fdevolucion[numero] = leer.cadena();
            System.out.println("¿Deseas editar otro libro [S/N]?");
            continuar = leer.cadena();
        }while(continuar.equalsIgnoreCase("S"));
    }
    public static void listarlibros(){
            System.out.println("Listado");
            System.out.println("N°\tCodigo\t\tF. Devol.\t\tLibro");
            for (int i = 0; i <=estado; i++) {
            System.out.println((i+1) + " \t " + codigo[i] + "     \t " + fdevolucion[i] + "      \t " + nombre[i]); 
            }
    }
    public static void salir(){
            System.out.println("Gracias por su visita"); 
    }
    public static void error(){
            System.out.println("Error, Opcion incorrecta"); 
    }
    public static void menu(){
            System.out.println(" MENU PRINCIPAL "); 
            System.out.println(" 1. Agregar libros a llevar ");
            System.out.println(" 2. Eliminar libros que llevas ");
            System.out.println(" 3. Editar libros no deseados ");
            System.out.println(" 4. Listar libros a llevar ");
            System.out.println(" 5. Salir ");
            System.out.print("Escoja una de las opciones: ");
    }
    public static void inicio(){
      int opcion;
     do {
         menu();
         opcion = leer.entero();
         switch(opcion){
             
            case 1: 
                agregarlibros();
                 break;
            case 2: 
                eliminarlibros();
                 break;       
            case 3: 
                editarlibros();
                 break;
            case 4: 
                listarlibros();
                 break;
            case 5: 
                salir();
                 break;
            default:
                error();
         }
         
     }while (opcion!= 5);  
    }
    public static void main(String[] args) {
       inicio(); 
    }
}
