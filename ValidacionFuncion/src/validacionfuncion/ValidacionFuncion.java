/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validacionfuncion;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/**
 * Desarrollar un algoritmo que permita poder trata una cadena 1. Pasar todo a
 * minuscula o mayuscula 2. Formatear una salida de mensaje 3. Ordenamiento de
 * letras de manera visual
 *
 *
 */
public class ValidacionFuncion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcionMenu = 0;
        String resultadoTratamiento = "Alex J";
        String capturaFrase = "Alex J";
        String tipo;

        System.out.println("Dime la frase a tratar");
        capturaFrase = scan.nextLine();

        System.out.println("------------------");
        System.out.println("Menu tratamientos");
        System.out.println("------------------");
        System.out.println("1. Pasar todo a minuscula / mayuscula");
        System.out.println("2. Formatear salida de mensaje");
        System.out.println("3. Ordenamiento de letras manera visual");
        opcionMenu = scan.nextInt();

        switch (opcionMenu) {
            case 1:
                System.out.println("Quieres que sea mayuscula o minuscula");
                tipo = scan.nextLine();
                resultadoTratamiento = MinusculaMayuscula(capturaFrase, tipo);
                break;
            case 2:
                resultadoTratamiento = FormateoCadena(capturaFrase);
                break;
                
            case 3:    
                resultadoTratamiento = Ordenamiento(capturaFrase).toString();
                break;
        } // Fin Switch

        System.out.println("Resultado de tratamiento:");
        System.out.println("------------------");
        System.out.printf("Frase Original: %s\n", capturaFrase);
        System.out.printf("Frase Modificada: %s \n", resultadoTratamiento);

    } // Fin Main

    public static String MinusculaMayuscula(String frase, String tipoTratamiento) {
        String temporal = frase;

        if (tipoTratamiento.equalsIgnoreCase("mayuscula")) {
            temporal = temporal.toLowerCase();
        } else {
            temporal = temporal.toLowerCase();
        }
        return temporal;

    }// Fin funcion minuscula y mayuscula
    
    public static String FormateoCadena(String frase){
        String temporal;
        
        temporal = String.format(Locale.forLanguageTag("es-HN"), "El camino es de" + frase);
        
        return temporal;
    }// Fin funcion formateo
    
    public static char[] Ordenamiento (String Frase ){
        char []datos;
        datos = Frase.toCharArray();
        Arrays.sort(datos);
        
        return datos;
        
    }// Fin Ordenamiento 

} // Fin Class 
