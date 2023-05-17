package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio5 {
/*
    Una tienda ofrece un descuento del 15% sobre el total de la compra 
    y un cliente desea saber cuánto deberá pagar finalmente por su compra
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int descuento = 15;
        double compra ;
        double precioFinal;
        
        System.out.println("Ingrese el valor de la compra, \n"
                + "al final se le informara al cliente el precio del producto \n"
                + "sin descuento y luego con el descuento");
        
        compra = leer.nextDouble();
        System.out.println("El producto salia " + compra + "$ con el " + descuento +"% de descuento es --> " + (((compra *descuento)/100)-(compra)) + "$");
        
        

    }
    
}
