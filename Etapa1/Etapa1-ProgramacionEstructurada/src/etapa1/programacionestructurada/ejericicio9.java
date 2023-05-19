package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejericicio9 {
/*
    Realizar un programa que pida un número y determine si ese número es par o impar. 
Mostrar en pantalla un mensaje que indique si el número es par o impar. (para que un 
número sea par, se debe dividir entre dos y su resto debe ser igual a 0). Nota: investigar 
la función mod de PseInt
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int num;
        
        System.out.println("Ingrese un numero para saber si es par o no");
        num = leer.nextInt();
   
        if (num % 2 == 0)
        {
            System.out.println("El numero es par");
        }else {
            System.out.println("El numero es impar");
        }
    }
    
}
