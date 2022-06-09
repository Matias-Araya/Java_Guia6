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
public class Fundamental11 {
public static void main(String[] args){
Scanner leer = new Scanner(System.in).useDelimiter("\n");

System.out.println("Ingrese un primer numero entero positivo");
int num = leer.nextInt();

System.out.println("Ingrese el segundo numero entero positivo");
int num2 = leer.nextInt();

boolean aux = true;

do {
   System.out.println("MENU:");
   System.out.println("1. Sumar"); 
   System.out.println("2. Restar");
   System.out.println("3. Multiplicar");
   System.out.println("4. Dividir");
   System.out.println("5. Salir");
   System.out.println("Elija una opción");
   int opc = leer.nextInt();
 
    switch (opc){
        case 1:
        System.out.println("El resultado de la suma de los numeros ingresados es " + (num + num2));
        break;
        case 2:
        System.out.println("El resultado de la resta de los numeros ingresados es " + (num - num2));
        break;
        case 3:
        System.out.println("El producto de los numeros ingresados es " + (num * num2));
        break;
        case 4:
        System.out.println("La división de los numeros ingresados es " + (num / num2));
        break;
        case 5:
            System.out.println("¿Está seguro de que desea abandonar la aplicacion (S/N)?");
            String x = leer.next();
            if (x.equals("S")){
                aux = false;
            } else{
        break;
            }
    }       
} while (aux == true); // para asignar valores, un solo =. Para comparar valores lógicos, ==

System.out.println("Usted ha abandonado la aplicacion");
}
}
