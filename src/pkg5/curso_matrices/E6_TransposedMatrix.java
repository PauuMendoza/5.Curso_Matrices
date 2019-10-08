/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

import java.util.Scanner;

/**
 *
 * @author Paulina
 * Ejercicio 6: Utilizando dos matrices de tamaño 5x9 y 9x5, cargar la primera y
 * trasponerla en la segunda.
 */
public class E6_TransposedMatrix {
    
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        
        int numberRows=5, numberColumns=9;
        int matrixOne [][] = new int[numberRows][numberColumns];;
        int matrixTwo [][]= new int[numberColumns][numberRows];
        
        
        System.out.println("***ENTER THE DATA***");
        for (int indexRow = 0; indexRow < numberRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < numberColumns; indexColumn++) {
                System.out.print("Matrix [" + indexRow + "][" + indexColumn + "]: ");
                matrixOne[indexRow][indexColumn] = input.nextInt();
            }
        }
        
        System.out.println("");
        
        System.out.println("**SHOW RESULT**");
        for (int indexRow = 0; indexRow < numberRows; indexRow++) {
            for (int indexColumns = 0; indexColumns < numberColumns; indexColumns++) {
                System.out.print(matrixOne[indexRow][indexColumns] + " ");
            }
            System.out.println("");
        }
        
        System.out.println("");
        //matrix trasposed
        for (int indexRow = 0; indexRow < numberColumns; indexRow++) {
            for (int indexColumns = 0; indexColumns < numberRows ; indexColumns++) {
                System.out.print(matrixOne[indexColumns][indexRow] + " ");
            }
            System.out.println("");
        }
    }
}
