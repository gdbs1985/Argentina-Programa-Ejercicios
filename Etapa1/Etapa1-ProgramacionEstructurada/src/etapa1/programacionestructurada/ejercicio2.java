package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio2 {
/*
A partir de una conocida cantidad de días que el usuario ingresa a través del teclado, 
escriba un programa para convertir los días en horas, en minutos y en segundos. Por 
ejemplo
1 día = 24 horas = 1440 minutos = 86400 segundos
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        int dia;
        int hh;
        int mm;
        int ss;
        
        //Le pedimos al usuario que ingrese una cantidad n de dias
        System.out.println("Ingrese la cantidad de dias que quiera para calcular sus segundos, munitos y horas");
        dia = leer.nextInt();
        //En base a la cantidad de dias calculamos los segundos, minutos y horas;
        hh = dia *24;
        mm = hh * 60;
        ss = mm * 60;
        //Imprimimos los resultados -->
        System.out.println("En un dia hay --> " + hh + " horas , o " + mm + " minutos y/o " + ss + " segundos");
        
              
        
        

    }
    
}
