/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesejercicio1;

import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class FuncionesEjercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner scan = new Scanner (System.in);
       
       double factura =0;
        System.out.println("Ingrese el monto de la factura");
        factura = scan.nextDouble();
        
        double propina = calcularPropina(factura);
        
        System.out.printf("Propina: %.2f \n", propina);
        
    } // Fin Main
    
    public static double calcularPropina (double monto){
        double propina = monto * 0.10;
        
        
        return propina;
    } // Fin funsion
    
} // Fin Class