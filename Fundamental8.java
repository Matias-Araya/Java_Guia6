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
public class Fundamental8 {
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
        
System.out.println("Por favor ingrese una frase o palabra de 8 caracteres");
String frase = leer.nextLine();

int cant = frase.length();

if (cant == 8)
        System.out.println("CORRECTO");

else
        System.out.println("INCORRECTO");
}
}
