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
public class Prueba {
    public static void main(String[] args){
    Scanner leer = new Scanner (System.in);
    int [] vector = new int [9];
    int [][] matriz = new int [3][3];

    System.out.println("Ingrese, con numeros del 1 al 9, los elementos de la matriz");    
        for (int h = 0; h < vector.length; h++) {
            vector[h] = leer.nextInt();
        }
    
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                matriz[i][j] = vector[h];
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }
        
    }
}
    
