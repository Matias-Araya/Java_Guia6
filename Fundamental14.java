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
public class Fundamental14 {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de euros a convertir");
        double moneda = leer.nextInt();
        
        System.out.println("La cantidad de euros ingresada equivale a " + conversionDolares(moneda, "dolares") + " dolares");
        System.out.println("La cantidad de euros ingresada equivale a " + conversionLibras(moneda, "libras") + " libras");
        System.out.println("La cantidad de euros ingresada equivale a " + conversionYenes(moneda, "yenes") + " yenes");
        
    }

    public static double conversionDolares (double moneda, String dolares){
    double conversionDolares = moneda * 1.28611;
    return conversionDolares;
    }
    
    public static double conversionLibras (double moneda, String libras){
    double conversionLibras = moneda * 0.86;
    return conversionLibras;
    }

    public static double conversionYenes (double moneda, String yenes){
    double conversionYenes = moneda * 129.852;
    return conversionYenes;
    }

}



