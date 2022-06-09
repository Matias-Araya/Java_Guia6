/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author CTI6345
 */
public class Fundamental16 {
    public static void main(String[] args){
        int cont = 0;
        Scanner leer = new Scanner(System.in);
        int [] vector = new int [10];
        int elemento;
        
        System.out.println("Ingrese el numero que desea buscar");
        int num = leer.nextInt();
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(10);
            System.out.print(vector[i]);
            System.out.print(" | ");
            if (vector[i] == num) {
                cont = cont + 1;
            }
        }
        System.out.println(" ");
        
        System.out.println("El numero ingresado se repite " + cont + " veces");
        }
    }
