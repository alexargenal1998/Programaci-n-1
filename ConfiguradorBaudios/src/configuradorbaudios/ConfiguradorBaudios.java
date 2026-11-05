/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package configuradorbaudios;
import java.util.Scanner;
/**
 *Configurador de Tasa de Baudios para Puerto Serial
 *(Selección Múltiple - switch)
 * Alex Argeñal
 */
public class ConfiguradorBaudios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido");
        System.out.println("Seleccione su velocidad: \n");
        System.out.println("1 = 9600 baudios");
        System.out.println("2 = 19200 baudios");
        System.out.println("3 = 115200 baudios");
        System.out.print("Seleccione un numero:");
        int opcion = scanner.nextInt();
        
        int velocidad= 0;
        
        // Estructura de selección múltiple
        switch (opcion){
            case 1:
                velocidad = 9600;
                break;
            case 2:
                velocidad = 19200;
                break;
            case 3:
                velocidad = 115200;
                break;
                
            default:
                System.out.println("Opcion no valida, usando 9600 bps por defecto");
        } // Fin Switch
        
    } // Fin Main
    
} // Fin Class
