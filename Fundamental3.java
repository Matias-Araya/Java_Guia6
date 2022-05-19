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
public class Fundamental3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Por favor ingrese una frase");
        String frase = leer.nextLine();
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        System.out.println("La frase ingresada en MAYÚSCULA es " + mayuscula);
        System.out.println("La frase ingresada en minúscula es " + minuscula);
    }
}
