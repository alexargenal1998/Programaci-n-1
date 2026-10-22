/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package saludos;
import java.util.Scanner;
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
        
        Scanner teclado = new Scanner(System.in); 
        System.out.printf("Tu nombre no es %s", nombre);
        System.out.print("Como te llamas realmente?");
        nombre = teclado.next();
        // .next() - captura cadena 
        System.out.printf(" Excelente %s, gracias gracias", nombre);
        
        System.out.printf("\n Muy bien %s, y se puede saber tu edad?", nombre);
        edad = teclado.nextInt();
        // .nextInt() - Captura entero
        
        System.out.printf("\n Ecole, te miras muy bien para los %d anios que te cargas", edad);
        System.out.printf("\n Y no parece que midas %.2f CM", altura);
        System.out.printf("\n O cuanto medis realmente?");
        altura = teclado.nextDouble();
        //.nextDouble() - captura altura
        
        System.out.printf("\n Solo una pregunta mas %s", nombre);
        System.out.printf("\n Eres Masculino (M) o Femenino (F) %s", nombre);
        genero = teclado.next().charAt(0);
        
        System.out.println("\n Datos generales");
        System.out.println("--------------");
        System.out.printf("Nombre: %s",nombre);
        System.out.printf("Edad: %d",edad);
        System.out.printf("altura: %f", altura);
        System.out.printf("Genero: %c", genero);
        System.out.println("--------------");
        
        int numero=0; 
        System.out.println("---------------");
        System.out.printf("\n Dice %s que tiene %d anios",nombre,edad);
        System.out.println("\n Yo creo que tiene mas... cuantos mas seran?");
        numero = teclado.nextInt();
        edad = edad + numero; // operacion aritmetica de Suma
        System.out.printf("Es decir... %d", edad);
        
       /* Orden de operaciones
        1. Parentesis 
        2. Exponentes
        3.Multiplicacion y division (Izq a Der)
        4. Suma y resta (Izq a Der)
        */
       
       double resultadoOperacion = 0;
       resultadoOperacion = 5 + 3 - 1 * 2;
        System.out.printf("\n Resultado: %.2f", resultadoOperacion);
        
        resultadoOperacion = 2 * (5 + 3) - 1;
        System.out.printf("\n Resultado: %.2f", resultadoOperacion);
        
        resultadoOperacion = 2 * (5 + 3) - 1;
        System.out.printf("\n Resultado: %.2f", resultadoOperacion);


    }// Fin de main 
    
}// Fin de class
