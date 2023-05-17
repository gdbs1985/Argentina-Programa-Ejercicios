/*
Crear un programa que solicite al usuario que ingrese 
el precio de un producto al inicio del  año, 
y el precio del mismo producto al finalizar el año.
El programa debe calcular cuál fue el 
porcentaje de aumento que tuvo ese producto en el año y mostrarlo por pantalla.
*/
package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejericicio3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double priceIni;
        double priceEnd;
        double percentage;
        
        //Le pedimos al usuario que ingrese el precio del producto al comienzo de anio
        System.out.println("Ingrese el precio del producto a comienzo de anio");
        priceIni = leer.nextDouble();
        //Le pedimos al usurario que ingrese el precio del producto al final del anio
        System.out.println("Ingrese el precio del producto al final del anio");
        priceEnd = leer.nextDouble();
        
        //Calculamos el porcentaje de aumento o decremento(con valor absoluto en caso de decremento
        percentage = (Math.abs(priceIni - priceEnd) * (priceIni)/100);
        System.out.println("El precio inicial es " + priceIni + " y el precio final es " + priceEnd + " el porcentaje de aumento es --> " + percentage + "%");

    }
    
}
