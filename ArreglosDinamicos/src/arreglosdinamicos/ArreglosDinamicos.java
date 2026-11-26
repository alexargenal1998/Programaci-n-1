/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arreglosdinamicos;
import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author alexa
 */
public class ArreglosDinamicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList <Integer> carros = new ArrayList <Integer> ();
        carros.add(10);
        carros.add(50);
        carros.add(-100);
        
        System.out.printf("Valores de ArrayList: %s\n", carros);
        
        carros.add(200);
        carros.add(1, 0); // 1er dato, es el indice y 2do dato, valor
        System.out.printf(" Nuevos valores del Arrayslist: %s \n", carros);
        
        // obtener o leer un dato del arraylist
        int dato = carros.get(3); // Indicando el indice 
        System.out.printf("Valor del indice 3: %s \n", dato);
        
        // Cambiar un dato
        carros.set(1,5);
        System.out.printf("Nuevos valores del arraylist: %s\n", carros);
        
        // Quitas un elemento 
        carros.remove(0);
        System.out.printf("Quitando un elemento del arraylist: %s\n", carros);
        System.out.printf("Nuevo tamanio del arraylist: %s \n", carros.size());
        // Quitar todos los elementos 
        carros.clear();
        System.out.printf("Removiendo todos los elementos del arraylist: %s\n", carros);
        System.out.printf("Nuevo tamanio del arraylist: %s \n", carros.size());
        
        ArrayList<String>marcas = new ArrayList <String>();
        marcas.add("BMW");
        marcas.add("Lexus");
        marcas.add("Nissan");
        marcas.add("Porsche");
        
        // Ciclo For Normal
        System.out.println("Ciclo For");
        for (int i = 0; i < marcas.size(); i++){
            System.out.printf("Marcas: %s\n", marcas.get(i));
        }// Fin ciclo for
        
        Collections.sort(marcas);
        
        
        // Ciclo for each
        System.out.println("Ciclo for each");
        for (String i : marcas){
            System.out.printf("%s \n", i);   
        }// Fin ciclo for each
        
        
        
        
    } // Fin Main
    
} // Fin Class
