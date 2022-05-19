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
public class Fundamental1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num, num2, resultado;
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Por favor ingrese el primer numero");
        num = leer.nextInt();
        
        System.out.println("Por favor ingrese el segundo numero");
        num2 = leer.nextInt();
        
        resultado = num + num2;
        
        System.out.println("La suma de los numeros ingresados es " + resultado);// TODO code application logic here
    }
    
}
