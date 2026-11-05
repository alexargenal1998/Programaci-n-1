/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generacioncontraseñaencriptada;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alexa
 */
public class GeneracionContraseñaEncriptada {

    /**
     * Generar una contaseña de n cantidad de caracteres en la cual se
     * convertira en la seguridad de ingreso al salon principal. Este debera de
     * encriptarse posteriormente a que se haya validado.
     */
    public static void main(String[] args) {
        Random rd = new Random();
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        int respuesta = 0;
        char caracter = '@';
        String password = "";
        int longitud= 0;
        int posPASS = 0;
        String passwordEncrypt= "";
        int valor = 0;

        System.out.println("Genremos una frase para luego encriptar");
        System.out.println("Iremos letra por letra (cualquier digito es valido)");
        System.out.println("");

        do {
            System.out.print("Dime la letra:");
            caracter = sc.next().charAt(0);
            // opcion 1
            password = password + String.valueOf(caracter);

            // Opcion 2
            sb.append(caracter);

            System.out.println("Desea ingresar otro carater? (1=si, no=0)");
            System.out.println("Respuesta:");
            respuesta = sc.nextInt();
        } while (respuesta != 0);
        password = sb.toString();
        System.out.printf("Pass: %s\n", password);

        longitud = password.length();
        
        while (posPASS < longitud){
            valor = (int) password.charAt(posPASS);
            System.out.printf("Valor: %d\n", valor);
            
            valor += rd.nextInt(10);
            passwordEncrypt += String.valueOf((char)valor);
            posPASS++;
            
            
        } // Fin While
        System.out.printf("Password Encrypted: %s", passwordEncrypt);

    } // Fin Main

} // Fin Class
