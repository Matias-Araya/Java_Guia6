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
public class Fundamental12 {
public static void main(String[] args){
Scanner leer = new Scanner (System.in);

String frase;
int correcto = 0;
int incorrecto = 0;
int largo;

do {
System.out.println("Ingrese una palabra de 5 caracteres, que comience con la letra <X> y termine con la letra <O>");
System.out.println("Para finalizar los envíos digite la siguiente secuencia: <&&&&&>"); 
frase = leer.nextLine();
largo = frase.length();
String inicio = frase.substring(0,1);
String fin = frase.substring(4,5);

if ((largo > 5)|| (largo < 5)){
incorrecto = incorrecto + 1;
}
if ((largo == 5)&&(inicio.equals("x"))&&(fin.equals("o"))){
correcto = correcto + 1;
}

} while (frase != "&&&&&");

System.out.println("La cantidad de ingresos correctos es " + correcto);
System.out.println("La cantidad de ingresos incorrectos es " + incorrecto);
}
}
