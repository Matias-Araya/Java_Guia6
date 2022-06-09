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
public class Fundamental6 {
  public static void main(String[] args){
  Scanner leer = new Scanner(System.in);
  System.out.println("Ingrese un numero entero");     
  int num = leer.nextInt();
  
  if ((num%2)== 0) {
      System.out.println("El número ingresado es PAR");
  }
  else {
      System.out.println("El numero ingresado es IMPAR");
  }       
    }
}
