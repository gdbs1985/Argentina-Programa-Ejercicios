package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num;
        int unidad;
        int decena;
        int centena;

        //Le pedimos al usuario que ingrese un numero de 3 cifras
        System.out.println("Ingrese un numero de 3 cifras para ver si es capicua");
        num = leer.nextInt();
        
        //Hacemos la logica para extraer la unidad y la centena
        unidad = (num % 100) %10;
        decena = num /100;
        if (unidad == decena)
        {
            System.out.println("Es capicua");
        }else {
            System.out.println("No es capicua");
        }
    }
    
}
