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
public class Fundamental7 {
public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese una frase o palabra");
    String frase = leer.nextLine();
    String coinc = "eureka";
    
   
if (coinc.equals(frase)){
    System.out.println("CORRECTO");
} 
else {
    System.out.println("INCORRECTO");
}
}
}