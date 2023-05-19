package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio10 {

    /*
Continuando el ejercicio anterior, ahora se pedirá una frase o palabra y se validara si la 
primera letra de la frase es igual a la última letra de la frase. Se deberá de imprimir un 
mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir 
“INCORRECTO”
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        String frase;
        String letraF;
        String letra;

        System.out.println("Ingrese una palabra");
        frase = leer.next();
        
        
        letra = frase.substring(0, 1);
        letraF = frase.substring(frase.length()-1, frase.length());
        

        if (letra.equalsIgnoreCase("A") && letraF.equalsIgnoreCase("A"))
        {
            System.out.println("Correcto");
        } else
        {
            System.out.println("Incorrecto");
        }

    }

}
