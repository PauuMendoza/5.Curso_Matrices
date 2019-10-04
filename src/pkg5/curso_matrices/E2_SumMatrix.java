/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg5.curso_matrices;

import java.util.Scanner;

/**
 *
 * @author Paulina Ejercicio 2: Crear y cargar dos matrices de tamaño 3x3,
 * sumarlas y mostrar su suma.
 */
public class E2_SumMatrix {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);

        int matrixOne[][], matrixTwo[][], matrixSum[][], nRows = 3, nColumns = 3;

        matrixOne = new int[nRows][nColumns];
        matrixTwo = new int[nRows][nColumns];
        matrixSum = new int[nRows][nColumns];

        System.out.println("**ENTER THE DATA FOR MATRIX ONE***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nColumns; indexColumn++) {
                System.out.print("Matrix One [" + indexRow + "][" + indexColumn + "]: ");
                matrixOne[indexRow][indexColumn] = input.nextInt();
            }
        }

        System.out.println("\n**ENTER THE DATA FOR MATRIX TWO");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nRows; indexColumn++) {
                System.out.print("Matrix Two [" + indexRow + "][" + indexColumn + "]: ");
                matrixTwo[indexRow][indexColumn] = input.nextInt();
            }
        }
        
        //SUM OF MATRIX
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nRows; indexColumn++) {
                matrixSum[indexRow][indexColumn] = matrixOne[indexRow][indexColumn]
                        + matrixTwo[indexRow][indexColumn];
            }
        }

        System.out.println("***SHOW RESULT***");
        for (int indexRow = 0; indexRow < nRows; indexRow++) {
            for (int indexColumn = 0; indexColumn < nRows; indexColumn++) {
                System.out.print(matrixSum[indexRow][indexColumn]+" ");
            }
            System.out.println("");
        }

    }
}
