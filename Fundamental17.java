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
public class Fundamental17 {
    public static void main (String[] args){
        int dig = 0, dosDig = 0, tresDig = 0, cuatroDig = 0, cincoDig = 0;
        System.out.println("Ingrese la cantidad de elementos del vector");
        Scanner leer = new Scanner (System.in);
        int elem = leer.nextInt();
        int [] vector = new int [elem];
        
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = new Random().nextInt(10000);
            }
        
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " - ");
        }
        
        System.out.println(" ");
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] / 10 == 0) {
                dig++; // sufijo ++ incrementa en 1 el valor de la variable; pero imprime por pantalla el valor original (la variable toma el nuevo valor para el resto del codigo).
                       // prefijo ++ incrementa en 1 el valor de la variable e imprime por pantalla el valor aumentado de la variable.
            }   else if (vector[i]  /  100 == 0){
                dosDig++;
            }   else if (vector[i]  /  1000 == 0){
                tresDig++;
            }   else if (vector[i]  /  10000 == 0){
                cuatroDig++;
            }   else if (vector[i]  /  100000 == 0) {
                cincoDig++;
            }   // la division por 10 no toma el numero total sino solo su cociente; cuando este llega a 0, se incrementa en 1 la variable que lo contiene
        }
        
        System.out.println("Hay " + dig + " números con 1 dígito");
        System.out.println("Hay " + dosDig + " números con 2 dígitos");
        System.out.println("Hay " + tresDig + " números con 3 dígitos");
        System.out.println("Hay " + cuatroDig + " números con 4 dígitos");
        System.out.println("Hay " + cincoDig + " números con 5 dígitos");
        
    }
}
