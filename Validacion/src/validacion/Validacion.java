/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacion;
import java.util.Scanner;

/**
 * Desarollar un ejercicio que permita contabilizar las horas de vuelo que tiene 
 * un piloto para poder acreditarse en el manejo del Boeing 747.
 * Este tiene 8 oportunidades para poder acumular las 100 horas requeridas. 
 * Cada vuelto, tiene un maximo de 20 horas de duracion
 * 
 * Mostrar el algoritmo que muestre el numero de horas que se han ido 
 * acumulando a lo largo de cada intent.
 * 
 * 
 */
public class Validacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in); // IMPORTANTE
        int horaVuelo = 0; // Se registra registra la cantidad de horas que se hizo en cada vuelo
        int totalHorasAcum = 0; // total de horas que se acumulan
        int numeroInt= 0; // contabilizacion de intentos de vuelo 
        final int MAX_HORAS = 20; // numero maximo de horas de vuelo
        final int MAX_INTENTOS = 8; // Numero maximo de intentos para la certificacion
        
        System.out.println("---------------------------------------------------");
        System.out.println(" Bienvenido al programa de certificacion");
        System.out.println(" de vuelos de Boeing 747 de la clase de Programacion");
        System.out.println("---------------------------------------------------");
        
        while (numeroInt < MAX_INTENTOS){
            System.out.println("Bitacora de registro de horas de vuelo");
            System.out.printf("Vuelo numero #%d\n", numeroInt+1);
            System.out.println("Horas en el aire");
            horaVuelo = sc.nextInt();
            
            do{
                if (horaVuelo > MAX_HORAS||horaVuelo <=0){
                    System.out.println("No se permite esa cantidad de horas");
                    System.out.printf(" El numero maximo de horas es de %d\n", MAX_HORAS);
                    System.out.println("Ingrese de nuevo las horas");
                    horaVuelo = sc.nextInt();
                }
                    
                } while (horaVuelo >MAX_HORAS|| horaVuelo<=0);
                
           
            numeroInt ++;
        } // FIN WHILE
        System.out.println("---------------------------------------------------");
        System.out.printf("Total de horas de vuelo: %d", totalHorasAcum);
        if (totalHorasAcum >100){
            System.out.println("Ha cumplido los requisitos, se puede certificar");
        } //FIN IF
        
        
        }//Fin main
    
}// fin class
        
/**
 * System.out.println("Visualizacion del ciclo WHILE");
        while (contadorWHILE<3);
        System.out.printf("# Ciclo: %d \n", contadorWHILE);
        contadorWHILE++;
    } // Fin WHILE
    System.out.println("\n-----------------\n");   
    
    System.out.println("Visualizacion del ciclo DO WHILE");
    do {
        System.out.printf("# Ciclo: %d \n", contadorDOWHILE);
        contadorDOWHILE++;
    } while (contadorDOWHILE<3); //fin de ciclo while
 */       
  

