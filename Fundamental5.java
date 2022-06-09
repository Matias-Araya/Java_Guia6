/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
/**
 *
 * @author CTI6345
 */
public class Fundamental5 {
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero entero");
    int num = leer.nextInt();
    int dup = num * 2;
    int trip = num * 3;
    double raiz = Math.sqrt(num);
    
    System.out.println("El doble del número ingresado es " + dup);
    System.out.println("El triple del numero ingresado es " + trip);
    System.out.println("La raíz cuadrada del numero ingresado es " + raiz);
}   
}
