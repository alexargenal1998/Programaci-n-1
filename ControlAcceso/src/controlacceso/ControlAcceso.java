/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package controlacceso;

import java.util.Scanner;

/**
 * Control de Acceso a Base de Datos (Selección Anidada) Alex Argeñal
 */
public class ControlAcceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del administrador:");
        String nombreAdmin = scanner.nextLine();

        // Estructura anidada
        // En Java, las cadenas se comparan usando el método .equals()
        if (nombreAdmin.equals("Jose")) {
            System.out.print("Ingrese el pin de 4 digitos: ");
            int pin = scanner.nextInt() ;

            if (pin == 1998) {
                System.out.println("Acceso concedido al motor de base de datos");
            } // Fin IF
            else {
                System.out.println("PIN incorrecto, acceso denegado");
            } // Fin If        
        } // Fin If
        else {
            System.out.println("Usuario no encontrado");
            return; 
        } // Fin else
        
    } // Fin Main

} // Fin Class
