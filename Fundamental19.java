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
public class Fundamental19 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        int [][] matriz = new int [3][3];
        int [][] transp = new int [3][3];
        boolean antisist = true;
        
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.println("Ingrese un valor para el elemento ["+fil+"]"+"["+col+"]");
                matriz[fil][col] = leer.nextInt();
                transp[col][fil] = matriz[fil][col];
            }
        }
        
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(matriz[fil][col] + " "); 
        }   System.out.println(" ");
        }
        
        System.out.println("====");
  
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(transp[fil][col] + " ");    
        }   System.out.println(" ");
        }
        
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[fil][col] == -(transp[fil][col])) {
                    antisist = true;
                }   else{
                    antisist = false; 
                }
        }
        }
    if (antisist == true) {
            System.out.println("La matriz es anti-sistémica");
        } else{
            System.out.println("La matriz no es anti-sistémica");
    }
}
}