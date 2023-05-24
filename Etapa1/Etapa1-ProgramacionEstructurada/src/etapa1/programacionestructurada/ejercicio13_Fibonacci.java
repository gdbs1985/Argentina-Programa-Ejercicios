package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio13_Fibonacci {

    /*
Realizar una función que permita obtener el término n de la sucesión de Fibonacci. 
La sucesión de Fibonacci es la sucesión de los siguientes números:
1, 1, 2, 3, 5, 8, 13, 21, 34, ...
Donde cada uno de los números se calcula sumando los dos anteriores a él. Por ejemplo:
La sucesión del número 2 se calcula sumando (1+1)
Análogamente, la sucesión del número 3 es (1+2),
Y la del 5 es (2+3),
Y así sucesivamente…
La sucesión de Fibonacci se puede formalizar de acuerdo a la siguiente fórmula: 
Fibonacci (n) = Fibonacci (n-1) + Fibonacci (n-2) para todo n > 1
Fibonacci (n) = 1 para todo n <= 1
Por lo tanto, si queremos calcular el término “n” debemos escribir una función que reciba 
como argumento el valor de “n” y que calcule la serie hasta llegar a ese valor.
Para conocer más acerca de la serie de Fibonacci consultar el siguiente link:
https://quantdare.com/numeros-de-fibonacci/
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n =0;
        int b = 1;
        int c = 0;
        int a = 0;
        
        System.out.println("Ingrese el valor de n ");
        n  = leer.nextInt();
        do
        {   
            System.out.println(c);//
         a = b;//Valor Fibonacci -2---1-0-1-1-2-
         b = c;//Valor Fibonacci -1---0-1-1-2-3-
         c = a+b;//Valor Fibonacci----1-1-2-3-5-
            //                    C-->1-1-2-3-5-
  
        } while (c < n); //Mientras C sea menor a n , se va a repetir el codigo.
        
    }

}
