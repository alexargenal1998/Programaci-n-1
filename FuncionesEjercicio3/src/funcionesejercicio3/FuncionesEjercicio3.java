/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesejercicio3;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class FuncionesEjercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int compania =  0;
        double minutos = 0;
       
        
        System.out.println("Eliga una de las siguientes opciones");
        System.out.println("1.KLARIN, 2.CONNOSTROS");
        compania = scan.nextInt();
        
        System.out.println("Cuantos minutos duro la llamada?");
        minutos = scan.nextDouble();
        
         double costo = costoLlamada(minutos, compania);
         
         System.out.printf("Costo= %.2f\n", costo);
        
        
    } // Fin Main
    
    public static double costoLlamada (double minutos, int compania){
        double tarifa = 0;
        
        if (compania == 1){
            tarifa = 1.50;   
        } else { 
            tarifa = 1.35;
        }// Fin If
        
        double costo = minutos * tarifa;
                
        return costo;
        
    } //Fin funcion 
    
} // Fin Class
