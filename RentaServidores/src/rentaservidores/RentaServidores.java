/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package rentaservidores;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class RentaServidores {

    /**
     * Renta de servidores

Renta de Servidores Web (Mezcla de switch e if/else con booleanos)
Una empresa de hosting renta servidores. El costo base por día es de $10.0. Se le pide al usuario la cantidad de días y el tipo de plan (“A” Básico, “B” Pro, “C” Empresarial). Usando un switch para añadir un costo extra diario:
·       Plan Básico se suma $0,
·       Plan Pro se suma $5,
·       Plan Empresarial se suma $15.
Después de calcular el subtotal, usar una estructura de selección simple para aplicar una promoción:
·       Si el cliente renta el servidor por más de 15 días y el plan es 'B'o 'C', se le aplica un 15% de descuento al total.
Se tiene que mostrar el total a pagar, la cantidad de días de renta y el plan seleccionado.
     */
    
    /**
     * Entradas
     * cantDia = 0; 
     * tipoPlan = 0;
     */
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner sc = new Scanner (System.in);
     double precio = 10.0; 
     int cantDia = 0;
     char tipoPlan = '@';
     double recargo= 0;
     double subTotal = 0; 
     double cosTotal= 0; 
     
     
        System.out.println("Bienvenido al sistema");
        System.out.println("Ingrese la cantidad de dias que rentara");
        cantDia = sc.nextInt();
        
        System.out.println("Que tipo de plan rentara?");
        System.out.println("A. Plan Basico + 0$");
        System.out.println("B. Plan Pro + 5$");
        System.out.println("C. Plan Empresarial + 15$");
        tipoPlan= sc.next().toUpperCase().charAt (0);
        
        switch (tipoPlan){
            case 'A': 
                recargo = 0;
                subTotal = cantDia * precio;
                System.out.println("El Subtotal es: " + subTotal);
                
            break; 
            case 'B':
                recargo = 5;
                subTotal = cantDia *(precio + recargo);
                System.out.println("El Subtotal es: " + subTotal);
            break; 
            case 'C':
                recargo = 15;
                subTotal = cantDia *(precio + recargo);
                System.out.println("El Subtotal es: " + subTotal);
            break;
            default:
                System.out.println("Ese plan no existe");
                return;
        } // fin switch
        
        boolean aplicaDescuento = (cantDia > 15)&&(tipoPlan == 'B' || tipoPlan== 'C');
        if (aplicaDescuento) {
            cosTotal = subTotal - (subTotal * 0.15);
            System.out.println("Su total a pagar es:" + cosTotal);
            System.out.println("Plan seleccionado:" + tipoPlan);
            System.out.println("Candidad de dias:" + cantDia);
        } else {
            cosTotal = subTotal;
            System.out.println("Su total a pagar es:" + cosTotal);
            System.out.println("Plan seleccionado:" + tipoPlan);
            System.out.println("Candidad de dias:" + cantDia);
        } // Fin Else
        
    }// fin main
    
}//fin class
