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
public class Fundamental9 {
public static void main(String[] args){
Scanner leer = new Scanner(System.in);

System.out.println("Ingrese una frase o palabra que comience con la letra <A>");
String frase = leer.nextLine();

String inicio = frase.substring(0, 1); 
//Para obtener la primera letra en una subcadena usamos 0 como inicio y 1 como fin.

if (inicio.equals("A")){
        System.out.println("CORRECTO");
}
else {
    System.out.println("INCORRECTO");
}
}
}

