package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio1 {
/*
Solicitar al usuario que ingrese la base y altura de un rectángulo, 
y calcular y mostrar por  pantalla el área y perímetro del mismo


    */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double base;
        double altura;
        double area;
        double perimetro;
        
        //Le pedimos al usuario base y altura y guardamos los valores en variables
        System.out.println("Ingrese la base ");
        base = leer.nextDouble();
        
        System.out.println("Ingrese la altura ");
        altura = leer.nextDouble();
        
        //Calculamos area - area = base * altura
        area = base * altura;
        //Calculamos perimetro - perimetro = 2 * altura + 2 * base
        perimetro = (altura + base)*2;
        
        //Mostramos los resultados
        System.out.println("El area es " + base + " de base y " + altura + " de altura, el area es igual --> " + area );
        System.out.println("EL perimetro es igual a , " + base + " de base, " + altura + " de altura, es igual --> " + perimetro );
    }
    
}
