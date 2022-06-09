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
public class Fundamental13 {
public static void main(String[] args){
Scanner leer = new Scanner(System.in);
System.out.println("Ingrese un numero entero positivo");
int num = leer.nextInt();

for (int i = 0; i < num; i++) {
    System.out.print("*");
    }
    System.out.println(" ");
    for (int i = 0; i < num-2; i++) {
    System.out.print("*");
        for (int j = 0; j < num-2; j++) {
            System.out.print(" ");
    }
        System.out.println("*");
    }   
    for (int i = 0; i < num; i++) {
    System.out.print("*");
        }
System.out.println(" ");
    }
}
