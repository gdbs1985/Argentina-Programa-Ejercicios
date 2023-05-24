package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio12_numPrimo {
/*
Realizar una función que reciba un numero ingresado por el usuario y averigüe si el número es 
primo o no. Un número es primo cuando es divisible sólo por 1 y por sí mismo, por ejemplo: 2, 
3, 5, 7, 11, 13, 17, etc. Nota: recordar el uso del MOD
    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int n ;
        int contador = 0;
        System.out.println("ingrese un numero para saber si es primo");
        n = leer.nextInt();
        
        for (int i = 1; i < n+1; i++)
        {
            if (n % i == 0)
            {
                contador =contador + 1;
            }
        }
        if (contador == 2 )
        {
            System.out.println("ES PRIMO");
        }else{
            System.out.println("no es primo");
        }
        
        
    }
}
