/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clasificadorseñalttl;

import java.util.Scanner;

/**
 * Clasificador de Señal Digital TTL
 * (Selección Doble)
 * Alex Argeñal
 */
public class ClasificadorSeñalTTL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.print("Ingrese el valor de voltaje leido:");
        double voltaje = scanner.nextDouble();
        
        // Estructura de selección doble
        if (voltaje>= 2.0){
            System.out.println("Estado Logico: ALTO (1)");
        } // Fin IF
        else {
            System.out.println("Estado Logico: BAJO (0)");
        } // Fin ELSE

    }//Fin Main

}//Fin Class
