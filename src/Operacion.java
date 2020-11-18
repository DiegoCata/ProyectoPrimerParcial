
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Diego
 */
public class Operacion {

  public static float sumarNumeros() {
        System.out.println("SUMA DE DOS NUMEROS");
        float numero1, numero2;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese Número 1: ");
        numero1 = Float.valueOf(s.nextLine());
        System.out.printf("Ingrese Número 2: ");
        numero2 = Float.valueOf(s.nextLine());
        System.out.printf("La suma es: ");
        return numero1 + numero2;
    }
    public static float restarNumeros() {
        System.out.println("RESTA DE DOS NUMEROS");
        float numero1, numero2;
        Scanner s = new Scanner(System.in);
        System.out.print("Ingrese Número 1: ");
        numero1 = Float.valueOf(s.nextLine());
        System.out.printf("Ingrese Número 2: ");
        numero2 = Float.valueOf(s.nextLine());
       System.out.printf("La Resta es: ");
        return numero1 - numero2;
    } 

        
    }


