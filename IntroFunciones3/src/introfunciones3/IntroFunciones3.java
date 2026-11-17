/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introfunciones;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class IntroFunciones {

    /**
     * Desarollar un algoritmo que permita encontrar: 1. Longitud de una cadena
     * 2. Transformar una cade en mayusculas o minusculas 3. Encontrar una
     * cadena dentro del texto
     *
     * El ejercicio dura todo el tiempo que sea necesario!
     * 
     * Elementos de un afuncion
     * 1. Modificador de acceso (publico, privado o protegido)
     * 2. tipo de datos a retornar:
     * Int - Devuelve un entero
     * DOUBLE - devuelve decimal
     * string - Devuelve cadena
     * Char - Devuelve un solo caracter 
     * void - No devuelve nada 
     * 
     * 3. nombre de la funcion / metodo
     * 4. Parametros del trabajo 
     * Pueden ser mas de un parametro, separados por comas
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rd = new Random();

        String texto = "Alex J";
        String frase = "Casi miro";
        int longitud = 0;
        String transformacion = "de algo";
        boolean estado = true;
        int seleccion = 0;
        char opcion = '1';

        do {
            System.out.println("Menu de tratamientos");
            System.out.println("-----------------------");
            System.out.println("1. Longitud de Cadena");
            System.out.println("2. Transformacion de Cadena");
            System.out.println("3. Cadena dentro de Cadena");
            System.out.println("Seleccion:");
            seleccion = scan.nextInt();
            scan.nextLine(); // Limpieza de buffer 

            System.out.println("Escribe la frase");
            texto = scan.nextLine();

            switch (seleccion) {
                case 1:
                    // System.out.println("Has seleccionado una opcion");
                    MensajeInicial(); //  funcion #1
                    
                    System.out.println("Longitud de Cadena");

                    //System.out.printf("El texto es: %s\n", texto);
                    MensajeTexto(texto,"Longitud de Cadena"); // Funcion #2
                    
                    longitud = texto.length();

                    System.out.printf("Longitud: %d", longitud);
                    System.out.println("");
                    break;
                case 2:
                    // System.out.println("Has selecionado una opcion");
                    
                     MensajeInicial(); //  funcion #2
                    System.out.println("Transformacion de Cadena");
                    System.out.println("A. Mayusculas, B. Minusculas");
                    System.out.println("Opcion: ");
                    opcion = scan.next().charAt(0);

                    //System.out.printf("El texto es: %s\n", texto);
                    MensajeTexto(texto,"Longitud de Cadena"); // Funcion #2

                    transformacion = MensajeTransformado(opcion, frase);

                    System.out.printf("Resultado: %s\n", transformacion);
                    break;
                    
                case 3:   
                    //System.out.println("Has selecionado una opcion");
                    
                     MensajeInicial(); //  funcion #3
                    System.out.println("Cadena dentro de cadena");
                   /** System.out.println("Que frase o juego de letras buscas?");
                    System.out.print("Frase: ");
                    frase =scan.next();
                    * */
                    
                    System.out.println("El texto que necesita es:");
                    //System.out.printf("El texto es: %s\n", texto);
                    MensajeTexto(texto,"Longitud de Cadena"); // Funcion #2
                    
                    frase = texto.substring(1,5);
                    System.out.printf("Resultado:%s\n", frase);
                    
                    break;
                    
                case 4:
                    estado = false;
                    System.out.println("Muchas gracias, hasta luego!");
                default:
                    System.out.println("Escogist cualquier cosa menos 1 - 4");
                    
            } // Fin Switch

        } while (estado);

    } // Fin Main
    
    public static void MensajeInicial(){
        System.out.println("Has seleccionado una opcion");
            System.out.println("Entre las diferentes opciones");
            System.out.println("Escogiste una de ellas... que es \n"); 
    }// Fin de mensaje inicial
    
    public static void MensajeTexto(String algunTexto, String frase)
    {
        System.out.println("-----------------------------------");
        System.out.println("El texto que se necesita es: ");
        System.out.printf("Texto:%s\n", algunTexto);
        System.out.println("-----------------------------------");
        System.out.println("Tratamineto a seguir");
        System.out.println(frase);
        
    }// Fin mensaje texto
    
    public static String MensajeTransformado (char letraSel, String lafrase){
        String textoConvertido;
        if (letraSel== 'A')
        {
            textoConvertido = lafrase.toUpperCase();

        } else {
            textoConvertido = lafrase.toLowerCase();
        }
        return textoConvertido;
    } // Fin Mensaje Transformado
    

} // Fin Class
