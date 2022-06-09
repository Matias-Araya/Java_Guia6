/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author CTI6345
 */
public class Fundamental15 {
    public static void main(String[] args){
    int[] vector = new int [100];
   
    
    for (int i = 0; i < vector.length; i++){
        System.out.println(i);
    }
        System.out.println("=========");
    
    for (int i = vector.length; i > 0; i--) { //inicializa la variable i con el largo del vector
        System.out.println(i);                // y se ejecuta el bucle mientras i sea mayor que 0 (true)
    }
}
}


