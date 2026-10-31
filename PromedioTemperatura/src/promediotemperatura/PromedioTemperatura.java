/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package promediotemperatura;

import java.util.Random;
import java.util.Scanner;

public class PromedioTemperatura {

    /**
     * Crear un algoritmo que permita sacar el promedio de temperaturas que se
     * da a lo largo de la semana. Si cada valor caer por debajo de los 21ºC y
     * arriba de los 16ºC diremos que esta frio. Sin embargo abajo de los 16º se
     * dira que esta muy helado y por arriba de los 21ºC y abajo de los 25ºC
     * esta fresco.
     *
     * Ciclos de repeticion: 1. While -> Ciclo "infinito" y finito. 2. Do...
     * While -> Ciclo "infinito" y finito. 3. For -> Finito.
     *
     * Elementos de un ciclo 1. Valor incial -> Punto de partida 2. Condicion Se
     * ejecuta mientas se mantenga True Se detiene el ciclo cuando la condicion
     * se vuelve False 3. Modificador -> La alteracion de el valor inicial para
     * que la condicion sea falso.
     *
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        double temp = 0;
        double acumuladorTemp = 0;
        double promedioTemp = 0;
        int numDia = 0; // Contar la cantidad de temperatura ingresada 

        while (numDia < 7) {
            System.out.printf("Ingrese la temperatura de dia %d:\n", numDia + 1);
            temp = sc.nextDouble();
            // System.out.printf("Antes de sumar, el valor de acumulador es: %.2f\n", acumuladorTemp);
            acumuladorTemp += temp; // acumuladorTemp + temp
            // System.out.printf("Antes de sumar, el valor de acumulador es: %.2f", acumuladorTemp);
            System.out.println("---------------------------------------------");
            numDia++; // ++ = Sumatoria de uno en uno 
        }// Fin while
        promedioTemp = acumuladorTemp / 7;
        System.out.printf("Promedio de la semana es: %.2f \n", promedioTemp);

        if (promedioTemp > 21) {
            System.out.println("Esta haciendo calor \n");
        } else if (promedioTemp < 21 && promedioTemp > 16)
        {
            System.out.println("Esta frio loco \n");
        } else if (promedioTemp < 16)
        {
            System.out.println("Esta MUY frio \n");
        } 
       /**
        * if (promedioTemp < 21 && promedioTemp > 16) {
            System.out.println("Esta frio loco");
        } else if (promedioTemp < 16)
        {
            System.out.println("Esta MUY frio");
        } else if (promedioTemp > 21)
        {
            System.out.println("Esta haciendo calor");
        } else {
            System.out.println("");
        }
        */

    }//Fin del main

}// Fin de class
