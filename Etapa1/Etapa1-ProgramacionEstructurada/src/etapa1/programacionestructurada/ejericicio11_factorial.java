
import java.util.Scanner;

public class ejericicio11_factorial {

    /*
La función factorial se aplica a números enteros positivos. El factorial de un número entero 
positivo (!n) es igual al producto de los enteros positivos desde 1 hasta n:
   
n! = 1 * 2 * 3 * 4 * 5 * (n-1) * n
Escriba un programa que calcule las factoriales de todos los números enteros desde el 1 
hasta el 5. El programa deberá mostrar la siguiente salida: 
    
!1 = 1
!2 = 1*2 = 2
...
!5 = 1*2*3*4*5 = 120

     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n;
        int resultado = 1;
        int contador = 0;

        System.out.println("Ingrese el valor de n");
        n = leer.nextInt();
     
        for (int i = 1; i < n+1; i++)
        {
            resultado = resultado * i;
            
        }
        System.out.println("resultado --> " + resultado);
        
        
    }

}
