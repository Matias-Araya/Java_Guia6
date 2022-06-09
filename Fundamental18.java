/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;
import java.util.Random;

/**
 *
 * @author CTI6345
 */
public class Fundamental18 {
 public static void main(String[] args){
     int [][] matriz = new int [4][4];
     
     for (int fil = 0; fil < 4; fil++) {
         for (int col = 0; col < 4; col++) {
             matriz[fil][col] = new Random().nextInt(9);
         }
     }
     
     System.out.println("Imprimiendo matriz original...");
     
     for (int fil = 0; fil < 4; fil++) {
         for (int col = 0; col < 4; col++) {
             System.out.print(matriz[fil][col] + " ");
         }
         System.out.println(" ");    
     }
     
     System.out.println("Imprimiendo matriz transpuesta...");
     
     for (int fil = 0; fil < 4; fil++) {
         for (int col = 0; col < 4; col++) {
             System.out.print(matriz[col][fil] + " ");
         }
         System.out.println(" ");      
 }   
}
}