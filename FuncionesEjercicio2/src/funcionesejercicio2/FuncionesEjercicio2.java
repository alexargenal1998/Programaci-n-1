/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesejercicio2;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class FuncionesEjercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int edad = 0;
        String nombre ="";
        
        System.out.println("Ingrese su nombre");
        nombre = scan.nextLine();
        
        System.out.println("Ingrese su edad");
        edad = scan.nextInt();
        
        System.out.printf("Nnombre: %s\n", nombre);
        
        mostrarDescuento(edad, nombre);
        
    } // Fin Main
    
    public static void mostrarDescuento (int edad, String nombre){
         if (edad >= 60){
            System.out.println("Si aplica descuento");
        } // Fin Funcion
        
    }// Fin Funcion
    
} // Fin Class
