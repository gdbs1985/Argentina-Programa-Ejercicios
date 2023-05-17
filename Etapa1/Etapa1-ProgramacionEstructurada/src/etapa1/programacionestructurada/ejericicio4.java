package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejericicio4 {
/*
    Calcular el cambio de monedas en dólares y euros al ingresar cierta 
    cantidad de dinero en pesos
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        double pesos;
        double dolar = 200;
        double euros = 250;
        
        //Le pedimos al usuario que ingrese pesos para convertirlos en dolares y euros
        System.out.println("Ingrese una cantidad n de pesos para convertir \n"
                + " --euros --> 250$--\n"
                + "--dolares --> 200$--" );
        pesos = leer.nextDouble();
        dolar = pesos / dolar;
        euros = pesos / euros;
        System.out.println(pesos + "$ es igual a " + dolar + "$ dolares y " + euros + "$ euros");


    }
    
}
