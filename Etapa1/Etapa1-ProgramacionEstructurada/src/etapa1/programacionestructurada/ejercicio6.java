package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio6 {
/*
Dado un número de dos cifras, diseñe un algoritmo que permita obtener el número 
invertido. Ejemplo, si se introduce 23 que muestre 32
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num;
        int unidad;
        int decena;
        
        System.out.println("Ingrese un numero de 2 cifras");
        num = leer.nextInt();
        
        unidad = num % 10;
        decena = num / 10;
        
        System.out.println("el num " + num + " dado vuelta es " + unidad + decena );


    }
    
}
