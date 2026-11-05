/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alarmacapacitadores;

import java.util.Scanner;

/**
 *Alarma de Voltaje en Capacitores 
 *(Selección Simple)
 * Alex Argeñal
 */
public class AlarmaCapacitadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el voltaje nominal (maximo soportado)");
        double voltNom = scanner.nextDouble();
        
        System.out.print("Ingrese el voltaje medio actual");
        double voltAct = scanner.nextDouble();
        
        // Calculo porcentaje carga actual
        double porcentajeCarga = (voltAct / voltNom)*100;
        
        // Estructura seleccion simple
        if (porcentajeCarga >85){
            System.out.println("ALERTA: Riesgo de sobretension. Disminuya la fuente");
        }// FIN IF
        
        // Fuera de la estructura siempre imprimir porcentaje actual
        System.out.printf("Porcentaje de carga actual:%.2f%% \n", porcentajeCarga);
        
        
        
    } // FIN CLASS

} // FIN MAIN
