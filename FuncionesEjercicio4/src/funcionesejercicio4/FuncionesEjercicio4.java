/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcionesejercicio4;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class FuncionesEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String frase = "";
        
        
        System.out.println("Escriba una frase");
        frase = scan.nextLine();
        int longitud = longitudFrase(frase);
        
        if (longitud > 15){
            System.out.println("!!QUE LARGO!!");
        } // Fin If
        
        
    } // Fin Main
    
    public static int longitudFrase(String frase){
        
        
        return frase.length();
    }// Fin Funcion
    
}// Fin Class
