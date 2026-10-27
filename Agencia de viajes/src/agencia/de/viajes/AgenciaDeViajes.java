/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agencia.de.viajes;
import java.util.Scanner;
/**
 *
 * @author alexa
 */
public class AgenciaDeViajes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       
       int selCuidad= 0;
       char selAventura= '@';
       double dinero= 0;
       
        System.out.println("Agencia de viajes de progra 1");
        System.out.println("La excelencia de la eleccion esta en sus manos");
        System.out.println("Nosotros colo propiciamos la vuelta al mundo!");
        
        System.out.println("Cual es su presupuesto?");
        dinero = sc.nextDouble();
        
        System.out.println("1. Antigua Guatemala (400$)");
        System.out.println("2. Catagena de Indias (800$)");
        System.out.println("3. Tokyo (1600$)");
        System.out.println("4. Milan (1200$)");
        System.out.print("Seleccion su destino: ");
        selCuidad = sc.nextInt();
            
        
        switch (selCuidad){
            case 1:
                  if (dinero < 400) {
                    System.out.println("No le alcanza");
                    return;
                } else {
                    System.out.println("Si le alcanza");
                    System.out.println("Visitando Guatemala");
                    System.out.println("Una cuidad colonial como...");
                    System.out.println("Antigua Guatemala");
                }
                break;
            case 2: 
                 if (dinero < 800) {
                    System.out.println("No le alcanza");
                    return;
                } else {
                System.out.println("Las mejores playas de...");
                System.out.println("Colombia!");
                System.out.println("Bienvenido a Cartagena");
                 }
                break;
            case 3:
                 if (dinero < 1600) {
                    System.out.println("No le alcanza");
                    return; // con el return se detiene el codigo antes de llegar a "else"
                } else {
                System.out.println("No es como la pelicula");
                System.out.println("pero si igual de espectacular");
                System.out.println("Tokyo, Japon");
                 }
                break;
            case 4:
                if (dinero < 1200) {
                    System.out.println("No le alcanza");
                    return;
                } else {
                System.out.println("La cuidad de la moda");
                System.out.println("Mucha aristocracia de por medio");
                System.out.println("Milan, Italia");
                }
                break;    
            default:
                System.out.println("Destino no encontrado!");
                System.out.println("Opcion incorrecta");
                System.out.println("Lea bien");
                break;
        }// Fin del switch
        
        System.out.println("Ahora busquemos una aventura por hacer");
        System.out.println("Con o sin ganas, pero viviendo la vida");
        System.out.println("A.Paracaidismo");
        System.out.println("B.Caminar por la Tigra");
        System.out.println("C. Montaña Rusa");
        System.out.println("D. Buceo");
        System.out.println("E. Canopy");
        System.out.println("F. Subir un volan");
        selAventura = sc.next().toUpperCase().charAt(0); // Pasa a mayuscula la escritura
        //selAventura = sc.next().toLowercCase().charAt(0); // pasa a minuscula la escritura
        
        switch (selAventura){
                case 'A':
                    System.out.println("Nos tiramos de un avion");
                    break;
                case 'B':
                    System.out.println("Vamos a caminar a la Tigra");
                    break;
                case 'C':
                    System.out.println("Gritaremos hasta quedar afonicos");
                    break;
                case 'D':
                    System.out.println("Admiremos los secretos del ocenano");
                    break;
                case 'E':
                    System.out.println("No se te ocurra quitar el seguro");
                    break;
                case 'F':
                    System.out.println("Tierra y ceniza volcanica entre los zapatos");
                    break;
                default:
                    System.out.println("Esa opcion, no existe");
                    
        } // Fin de switch
        
    } // Fin de main
    
} // Fin de class
