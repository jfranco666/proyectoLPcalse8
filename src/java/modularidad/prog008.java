
package modularidad;

// autor: jean retamozo
public class prog008 {
   // metodo que reciban parametros
    public static void saludo(String nombre){
        System.out.println("bienvenido" + nombre);
        System.out.println("disfruta tu estadia en este lugar");
    }
    public static void saludo2(String nombre, String carrera){
        System.out.println("disfruta tu estadia en la carrera de" + carrera);
    }
    public static void factorial(int num){
        int fac = 1;
        for (int i = 1; i <= num; i++) {
          fac*=1;  
        }
        System.out.println("factorial de "+num +":" +fac);
    }
    public static void main(String[] args) {
        saludo("daniel");
        saludo2("juan","ing sistemas");
        factorial(5);
    }
    }

