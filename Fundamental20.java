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
public class Fundamental20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[][] matriz = new int[3][3];
        int columna = 0, diag = 0, fila = 0;

        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.println("Ingrese un valor, entre 1 y 9, para el elemento [" + fil + "]" + "[" + col + "]");
                matriz[fil][col] = leer.nextInt();
            }
        }
        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                System.out.print(matriz[fil][col] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("==");

        for (int fil = 0; fil < matriz.length; fil++) {
            for (int col = 0; col < matriz.length; col++) {
                if (matriz[fil][col] > 0 && matriz[fil][col] < 10) {
                    if (fil == col) {
                        diag = diag + matriz[fil][col];
                        if (fil == 1) {
                            fila = fila + matriz[fil][col];
                        }
                    } else if (fil == 1) {
                        fila = fila + matriz[fil][col];
                    }
                }
            }
            columna = columna + matriz[fil][0];
        }

        if (diag == columna && diag == fila) {
            System.out.println("Oh oh oh it´s magic...you know!");
        } else {
            System.out.println("La matriz no es mágica, o sus elementos no estan en rango");
        }
    }
}
