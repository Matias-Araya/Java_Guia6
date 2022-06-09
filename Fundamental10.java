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
public class Fundamental10 {
public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    
    System.out.println("Ingrese un numero entero positivo");
    int num = leer.nextInt();
    System.out.println("Ingrese el primer numero a sumar");
    int num2 = leer.nextInt();
    System.out.println("Ingrese el segundo a sumar");
    int num3 = leer.nextInt();
    int result = num2 + num3;
    
   while (result <= num) {
        System.out.println("Ingrese un numero adicional");
        int aux = leer.nextInt();
        result = result + aux;
}  
    System.out.println("El resultado de los numeros ingresados es " + result);
}
}