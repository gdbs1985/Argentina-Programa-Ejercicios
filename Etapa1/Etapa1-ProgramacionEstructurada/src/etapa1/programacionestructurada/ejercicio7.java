package etapa1.programacionestructurada;

import java.util.Scanner;

public class ejercicio7 {

    /*
Un ciclista parte de una ciudad A a las HH horas, MM minutos y SS segundos.
El tiempo de viaje hasta llegar a otra ciudad B es de T segundos.
Escribir un algoritmo que determine la hora de llegada a la ciudad B
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int hhA;
        int mmA;
        int ssA;
        int hhB;
        int mmB;
        int ssB;
        int t;

        System.out.println("Ingrese la hora de partida \n"
                + "para es le solicitamos que ingrese \n"
                + "-1 Las horas ");
        hhA = leer.nextInt();
        System.out.println("2- Los minutos");
        mmA = leer.nextInt();
        System.out.println("3- Los segundos");
        ssA = leer.nextInt();

        //Le pedimos al user que nos indique en segundos el tiempo que demoro en llegar al punto B
        System.out.println("Ingrese la cantidad de segundos en el que demoro en ir del punto A al B");
        t = leer.nextInt();
        
        //Armamos la logica para un reloj
        ssB = t % 60;
        mmB = (t/60) % 60;
        hhB = ((t/60)/60);
        
        //Imprimimos el horario de llegada
        System.out.println("El horario de llegada es --> " + ((hhA+hhB)%24) + ":" +(mmA+mmB) + ":" + (ssA+ssB));
        
    }

}
