/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludos;

/**
 *
 * @author alexa
 */
public class Saludos {

    /**
     * @param args the command line arguments
     */
    
    // Doble diagonal es una linea de comentario
    /*
    Diagonal asteristo abre un bloque de comentario, y todo lo que se escriba aqui sera tomado 
    como un comentario hasta que encuentre asterico diagonal (Cierre de comentario)
    
    */
    
    
    public static void main(String[] args) {
        // Mostrar contenido dentro de la pantalla
       System.out.println ("Aqui va un primer mensaje");
       System.out.println("Luego una segunda linea para el mensaje");
       System.out.println("Coloquemos dentro del mensaje un tercero");
       

        System.out.println("-------------------------------------");
        System.out.println("cual sera la diferencia entre");
        System.out.println("entre println y print");
        System.out.print("Probando....");
        System.out.println("Aqui van PrintLN");
        System.out.print("Y aqui va Print");
        System.out.println("notas la diferencia");
       
        System.out.println("------------------------------------------");
        // Contra pleca -> Alt + 92 \
        System.out.printf("Probando un nuevo saludo para %s \n","Alex");
        System.out.printf("Te saludo todas las veces :%d",5);
        System.out.println("");
        System.out.printf("probando un %s nuevo saludo para \n","Alex");
        System.out.printf("Te saludo todas %d las veces :",5);
        System.out.println("");
        System.out.printf("%s probando un nuevo saludo para \n","Alex");
        System.out.printf("%d Te saludo todas las veces :",5);
        
        /* 
%s -> Es para texto
%d -> Es para numeros enteros 
%f -> Es para numeros decimales
%b -> Es para estados booleanos
        */ 
        // Tipos de variables
        // Palabras resaltadas con color son palabras CLAVE
        int edad; // Una variable para numeros ENTEROS
        double altura; // Un espacio para numeros DECIMALES 
        String nombre; // Un espacio para cadenas, palabras, frases
        char genero; // Un espacio para letras, digitos, caracteres especiales
        boolean estado; // Un espacio para verdadero o falso (true) o (false)
        
       edad = 15;
       altura = 1.78;
       nombre = "Alex"; 
       genero = 'm'; // Tecla alt + 39 -> comilla simple
       estado = true; 
       
        System.out.printf("Era una vez un personaje llamado %s \n", nombre);
        System.out.print(" en la que buscaba congrasiarse \n");
        System.out.printf("con gente del genero %c", genero);
        System.out.printf("el detalle estaba con los %f metros", altura);
        System.out.print("Media!!!\n");
        System.out.printf("Pero lo compensaba con los %d anios de buena vibra!!", edad);
       
       
    }// Fin de main 
    
}// Fin de class
