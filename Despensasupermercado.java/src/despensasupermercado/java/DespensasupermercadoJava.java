/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package despensasupermercado.java;

import java.util.Scanner;


/**
  *
  * Un supermercado desea desarrollar un programa para gestionar algunos productos de su despensa.

    El programa deberá solicitar al usuario:

    1. El nombre del producto.
    2. La cantidad de unidades disponibles en la despensa.
    3. El precio por unidad.
    * 
    * Si la cantidad disponible es menor a 10 unidades, el programa debe mostrar 
    * un mensaje indicando:
    *   "El producto necesita ser reabastecido."
    * 
    * Luego, el programa deberá verificar el precio del producto:
    * 
    *   Si el precio es mayor o igual a 50, mostrar:
    *       "Producto de precio alto."
    * En caso contrario, mostrar:
    *       "Producto de precio económico."
    * 
    * 
    * Mostrar todo lo que se pidio junto a los mensajes,
    * incluir cuanto gastaria si se lleva producto.
 */
public class DespensasupermercadoJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        String nombreProducto = "Alex J";
        int stock = 0;
        double precio= 0.0;
        double cantidadProductos= 0;
        double total= 0.0;
        
        System.out.println("Super de progra");
        System.out.print("Dime el nombre del producto a comprar");
        nombreProducto = scan.nextLine();
        
        System.out.printf("Cuanto hay en stock para %s",nombreProducto);
        stock = scan.nextInt();
        System.out.printf("Cuanto quiere comprar?", cantidadProductos);
        cantidadProductos= scan.nextInt();
        
        System.out.printf("Que cuesta %s?", nombreProducto);
        precio= scan.nextDouble();
        
        if(stock < 10){
            // IF se ejecuta si la condicion es VERDADERA
            System.out.println("El producto necesita");
            System.out.println("Ser reabastecido!");
    } // FIN DEL IF
        
        if(precio>= 50){ 
             System.out.println("Producto precio alto!");
        }
        else {
            System.out.println("Producto de precio economico");
        }
        
        System.out.println("Lista de compra");
        total = precio * cantidadProductos;
        System.out.printf("Productos:%s,Total:%.2f",nombreProducto,total);
      
        
        
        
        
        
        }//FIN DE MAIN
    
    
} //FIN DE CLASS