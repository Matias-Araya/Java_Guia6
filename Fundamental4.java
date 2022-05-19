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
public class Fundamental4 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la temperatura en grados centígrados (Celsius)");
        double grados = leer.nextDouble();
        grados = 32 + (9 * (grados / 5));
        System.out.println("La temperatura ingresada en grados Farenheit es de " + grados);
    }
}
