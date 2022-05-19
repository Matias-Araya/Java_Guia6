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
public class Fundamental2 {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("Su nombre es " + nombre);
    }
}
